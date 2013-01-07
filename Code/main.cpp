#include "BUGSParser.hpp"
#include "BUGSDataParser.hpp"
#include <iterator>

using namespace BUGS;
using namespace BUGSData;

void parseProgram()
{
    BUGSLexerTraits::InputStreamType input((ANTLR_UINT8*)"Test", ANTLR_ENC_8BIT);
    BUGSLexer lxr(&input);
    BUGSParserTraits::TokenStreamType tstream(ANTLR_SIZE_HINT, lxr.get_tokSource() );
    BUGSParser psr(&tstream);
    Program program = psr.prog();
    for(std::list<Node*>::iterator it = program.nodes.begin();it != program.nodes.end();++it){
        cout << endl << (*it)->nodename << endl;
        cout << ((StochasticNode*)((*it)))->distribution->name << endl;
        list<string> parameters = ((StochasticNode*)((*it)))->distribution->parameters;
        for(std::list<string>::iterator stit = parameters.begin();stit != parameters.end();++stit){
            cout << *stit << " ";
        }
    }

    cout << "Done Parsing";
}

void parseData() {
	BUGSDataLexerTraits::InputStreamType input((ANTLR_UINT8*)"TestData", ANTLR_ENC_8BIT);
	BUGSDataLexer lxr(&input);
	BUGSDataParserTraits::TokenStreamType tstream(ANTLR_SIZE_HINT, lxr.get_tokSource() );
	BUGSDataParser psr(&tstream);

	IData* mmdata = psr.data();
	map<std::string, float> scalars = ((MainMemoryData*) mmdata)->scalars;
	for (std::map<std::string, float>::iterator it = scalars.begin(); it!=scalars.end(); ++it){
		cout << "value of " << (*it).first << "=>" << (*it).second << "=>" << mmdata->getData((*it).first) <<endl;
	}

	cout << "Done Parsing Data";
}

int main(int argc, char* argv[])
    {
	//parseProgram();
	parseData();
    return 1;
    }


