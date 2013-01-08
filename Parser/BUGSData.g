grammar BUGSData;

options {language = Cpp;}

tokens {
	LIST = 'list(';
	EQUALTO = '=';
	CLOSEBRACKET =')';
	COMMA = ',';
	VECTORBEGIN = 'c(';
	STRUCTUREBEGIN = 'structure(';
	DOTDATA ='.Data';
	DOTDIM = '.Dim';
}

@lexer::namespace {BUGSData}
@parser::namespace {BUGSData}
@lexer::traits {

     class BUGSDataLexer; class BUGSDataParser;

     typedef antlr3::Traits< BUGSDataLexer, BUGSDataParser > BUGSDataLexerTraits;

     typedef BUGSDataLexerTraits BUGSDataParserTraits;

}
@lexer::includes{
#include <iostream>
using namespace std;
}
@parser::includes{
#include "BUGSDataLexer.hpp"
#include "DataClasses/IData.hpp"
#include "DataClasses/MainMemoryData.hpp"
}

data	returns [MainMemoryData* mmdata = new MainMemoryData()]
scope{
	map<std::string, float> scalars;
	map<std::string, std::vector<float> > vectors;
	map<std::string, BugsArray* > array;
}
	: LIST datatype (COMMA datatype)* CLOSEBRACKET 
	{mmdata->scalars = $data::scalars; mmdata->vectors = $data::vectors; mmdata->array = $data::array;}
	;
	
datatype 	
	: scalar {$data::scalars[$scalar.nodename] = $scalar.value;}
	| vector {$data::vectors[$vector.nodename] = $vector.value;}
	| array  
	{ BugsArray* bugsarray = new BugsArray();
	bugsarray->data=$array.value;
	bugsarray->dimensions=$array.dimensions;
	$data::array[$array.nodename]= bugsarray; }
	;
	
array	returns [std::string nodename, std::vector<float> value, std::vector<float> dimensions]
	: NODENAME EQUALTO STRUCTUREBEGIN DOTDATA EQUALTO v1=vectordata COMMA DOTDIM EQUALTO v2=vectordata CLOSEBRACKET
	{$nodename = $NODENAME.text; $value=$v1.value; $dimensions=$v2.value;}
	;

vector	returns [std::string nodename, std::vector<float> value]
	: NODENAME EQUALTO vectordata {$nodename = $NODENAME.text; $value = $vectordata.value;}
	;

vectordata   returns [std::vector<float> value]
	: VECTORBEGIN cv1=CONSTANTVALUE {$value.push_back(::atof($cv1.text.c_str()));} (COMMA cv2=CONSTANTVALUE {$value.push_back(::atof($cv2.text.c_str()));})* CLOSEBRACKET
	;
	

scalar	returns [std::string nodename, float value]
	: NODENAME EQUALTO CONSTANTVALUE {$nodename = $NODENAME.text; $value=::atof($CONSTANTVALUE.text.c_str());}
	;

NODENAME 
	:('a'..'z'| 'A'..'Z') ('a'..'z'| 'A'..'Z'| '0'..'9'| '.')* 
	;

CONSTANTVALUE 
	: ('+'|'-')?('0'..'9')+('.'('0'..'9')+)?
	;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| ';' | '\u000C' )+    { $channel = HIDDEN; } ;

