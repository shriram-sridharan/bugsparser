#include "BUGSParser.hpp"
#include "BUGSDataParser.hpp"
#include <iterator>
#include <typeinfo>

using namespace BUGS;
using namespace BUGSData;

void parseProgram(IData* mmdata)
{

    BUGSLexerTraits::InputStreamType input((ANTLR_UINT8*)"Test", ANTLR_ENC_8BIT);
    BUGSLexer lxr(&input);
    BUGSParserTraits::TokenStreamType tstream(ANTLR_SIZE_HINT, lxr.get_tokSource() );
    BUGSParser psr(&tstream);
    cout << "Coming here" << endl;
    Program program = psr.prog(mmdata);

    for(std::list<Node*>::iterator it = program.nodes.begin();it != program.nodes.end();++it){
        cout << endl << (*it)->nodename << " ";
        vector<int> nodeparameters = (*it)->parameters;
        for(std::vector<int>::iterator stit = nodeparameters.begin();stit != nodeparameters.end();++stit) {
			cout << *stit << " ";
		}

        if(typeid(**it) == typeid(UnivariateNode)){
			cout << ((UnivariateNode*)((*it)))->distribution->name << " ";
			list<string> parameters = ((UnivariateNode*)((*it)))->distribution->parameters;
			for(std::list<string>::iterator stit = parameters.begin();stit != parameters.end();++stit){
				cout << *stit << " ";
			}
        }

        if(typeid(**it) == typeid(LogicalNode)){
			cout << ((LogicalNode*)(*it))->functionname << " ";
			LogicalNode* ln = ((LogicalNode*)(*it));
			for(std::vector<string>::iterator stit = ln->parentnodes.begin();stit != ln->parentnodes.end();++stit){
				cout << *stit << " ";
			}
			cout << endl<< ln->expression ;
		}
    }

    cout << endl<< "Done Parsing" << endl;
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

	IData* mmdata = psr.data();
    testData(mmdata);

	cout << "Done Parsing Data";
	return mmdata;
}

int main(int argc, char* argv[])
    {
	try{
		IData* data = parseData();
		parseProgram(data);
	}
	catch (const std::exception& ex) {
		cout << "Exception" << ex.what() << endl;
	}
	catch(...){
		cout << "Exception" << endl;
	}
    return 1;
    }


