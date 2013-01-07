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
}
	: LIST datatype (COMMA datatype)* CLOSEBRACKET {mmdata->scalars = $data::scalars;}
	;
	
datatype 	
	: scalar {$data::scalars[$scalar.nodename] = $scalar.value;}
	| vector
	| array
	;
	
array	
	: NODENAME EQUALTO STRUCTUREBEGIN DOTDATA EQUALTO vectordata COMMA DOTDIM EQUALTO vectordata CLOSEBRACKET
	;

vector	
	: NODENAME EQUALTO vectordata
	;

vectordata 
	: VECTORBEGIN CONSTANTVALUE (COMMA CONSTANTVALUE)* CLOSEBRACKET
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

