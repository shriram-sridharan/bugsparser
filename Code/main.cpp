#include "BUGSParser.hpp"
#include "BUGSDataParser.hpp"
#include "FinalClasses/StochasticNode.hpp"
#include <iterator>
#include <typeinfo>

using namespace BUGS;
using namespace BUGSData;

Program parseProgram()
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
    return program;
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

void parseEvaluatedProgram(list<IFinalNode*> finalnodes)
{
    std::list<IFinalNode*>::iterator it;
    map<string, int> queryvariables;
    map<int, int> evidencevariables;
    map<string, int> factors;
    int variableid = 0;
    int factorid = 0;

    cout << "*****************Evaluated Values Begin ********************" << endl;
    for(it = finalnodes.begin();it != finalnodes.end();++it){
        StochasticNode *stochasticNode = (StochasticNode*)((*it));

        map<string,int>::iterator it = queryvariables.find(stochasticNode->nodename);
        if(it == queryvariables.end()) {
        	queryvariables[stochasticNode->nodename] = variableid;
        	++variableid;
        	cout << " QVariable : " <<stochasticNode->nodename<< ":" << queryvariables[stochasticNode->nodename] << endl;
        }
//        cout << stochasticNode->nodename << " " << queryvariables[stochasticNode->nodename] << " ";

        map<string,int>::iterator fit = factors.find(stochasticNode->distributionname);
        if(fit == factors.end()) {
        	factors[stochasticNode->distributionname] = factorid;
        	++factorid;
        	cout << " Factor : " << stochasticNode->distributionname << ":" << factors[stochasticNode->distributionname] << endl;
        }
//        cout << stochasticNode->distributionname << " " << factors[stochasticNode->distributionname] << " ";
        cout << " Edge : " << queryvariables[stochasticNode->nodename] << ":" << factors[stochasticNode->distributionname] << endl;

        vector<DistParams*> distparams = stochasticNode->distributionparameters;
        if(distparams.size() != 0){
            std::vector<DistParams*>::iterator dit;
            for(dit = distparams.begin();dit != distparams.end();++dit){
                if((*dit)->type == DISTNODE) {
                	if(queryvariables.find((*dit)->nodename) == queryvariables.end()){
                		queryvariables[(*dit)->nodename] = variableid;
                		++variableid;
                		cout << " QVariable : " <<(*dit)->nodename<< ":" << queryvariables[(*dit)->nodename] << endl;
                	}
                	cout << " Edge : " << queryvariables[(*dit)->nodename] << ":" << factors[stochasticNode->distributionname] << endl;
//                    cout << (*dit)->nodename << " id = " << queryvariables[(*dit)->nodename] << " ";
                }
                else {
                	if(evidencevariables.find((*dit)->value) == evidencevariables.end()){
                		evidencevariables[(*dit)->value] = variableid;
                		++variableid;
                		cout << " EVariable : " <<(*dit)->value<< ":" << evidencevariables[(*dit)->value] << endl;
                	}
                	cout << " Edge : " << evidencevariables[(*dit)->value] << ":" << factors[stochasticNode->distributionname] <<endl;
//                    cout << (*dit)->value << " id = " << evidencevariables[(*dit)->value] << " ";
                }
            }
            cout << endl;
        }
    }
    cout << "*****************Evaluated Values End ********************" << endl;
}

int main(int argc, char* argv[])
    {
	IData* data = parseData();
	Program prog = parseProgram();
	list<IFinalNode*> finalnodes = prog.eval(data);
    parseEvaluatedProgram(finalnodes);
    return 1;
    }


