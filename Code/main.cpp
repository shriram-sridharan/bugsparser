#include "BUGSParser.hpp"
#include "BUGSDataParser.hpp"
#include <iterator>
#include <typeinfo>

using namespace BUGS;
using namespace BUGSData;

void parseProgram()
{

    BUGSLexerTraits::InputStreamType input((ANTLR_UINT8*)"Test", ANTLR_ENC_8BIT);
    BUGSLexer lxr(&input);
    BUGSParserTraits::TokenStreamType tstream(ANTLR_SIZE_HINT, lxr.get_tokSource() );
    BUGSParser psr(&tstream);
    cout << "******************** Begin Parsing Program ****************** " << endl;
    Program program = psr.prog();
    std::list<IStatement*>::iterator stit;
    std::vector<Expression*>::iterator exit;

    for (stit = program.statements.begin(); stit!=program.statements.end(); stit++){
    	cout << (*stit)->toString();
    }

    cout << "******************** End Parsing Program ****************** " << endl << endl;
}

void testData(IData *mmdata)
{
    map<std::string,float> scalars = ((MainMemoryData*)(mmdata))->scalars;
    vector<int> indices;
    for(std::map<std::string,float>::iterator it = scalars.begin();it != scalars.end();++it){
        cout << "value of " << (*it).first << "=>" << (*it).second << "=>" << mmdata->getData((*it).first, indices) << endl;
    }
    map<std::string,vector<float> > vectors = ((MainMemoryData*)(mmdata))->vectors;
    for(std::map<std::string,vector<float> >::iterator it = vectors.begin();it != vectors.end();++it){
        cout << "value of " << (*it).first;
        for(std::vector<float>::iterator f = (*it).second.begin();f != (*it).second.end();++f){
            cout << "=>" << *f;
        }
        cout << endl;
    }

    map<std::string,BugsArray*> array = ((MainMemoryData*)(mmdata))->array;
    for(std::map<std::string,BugsArray*>::iterator it = array.begin();it != array.end();++it){
        cout << "value of " << (*it).first << endl;
        std::vector<int> location;
        location.push_back(1);
        location.push_back(4);
        cout << (*it).second->getData(location) << endl;
    }
}

IData* parseData() {
	BUGSDataLexerTraits::InputStreamType input((ANTLR_UINT8*)"TestData", ANTLR_ENC_8BIT);
	BUGSDataLexer lxr(&input);
	BUGSDataParserTraits::TokenStreamType tstream(ANTLR_SIZE_HINT, lxr.get_tokSource() );
	BUGSDataParser psr(&tstream);

	cout << "******************** Begin Parsing Data ****************** " << endl;
	IData* mmdata = psr.data();
    testData(mmdata);

	cout << "******************** End Parsing Data ****************** " << endl << endl;
	return mmdata;
}

int main(int argc, char* argv[])
    {
	IData* data = parseData();
	parseProgram();
    return 1;
    }


