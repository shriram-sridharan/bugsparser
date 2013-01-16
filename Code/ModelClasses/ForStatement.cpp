/*
 * ForStatement.cpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#include "ForStatement.hpp"
#include <sstream>
#include <iostream>
using namespace std;

ForStatement::ForStatement() {
	// TODO Auto-generated constructor stub

}

ForStatement::~ForStatement() {
	// TODO Auto-generated destructor stub
}

string ForStatement::toString(){
	string retval = "*ForStatementBegin  ";
	retval = retval + "Loopvariable = " + this->loopvariable + " ";

	if(this->begintype == LOOPNODE)
		retval = retval + "Loopbegin is Node = " + this->loopbegin.uvnode->toString();
	else
	{
		stringstream ss (stringstream::in | stringstream::out);
		ss << this->loopbegin.constant;
		retval = retval + "Loopbegin is Constant = " + ss.str() + " ";
	}

	if(this->endtype == LOOPNODE)
			retval = retval + "Loopend is Node = " + this->loopend.uvnode->toString();
	else
	{
		stringstream ss (stringstream::in | stringstream::out);
		ss << this->loopend.constant;
		retval = retval + "Loopend is Constant = " + ss.str() + " ";
	}
	retval += "\n";
	for (std::list<IStatement*>::iterator stit = this->statements.begin(); stit!=this->statements.end(); stit++)
		retval = retval + (*stit)->toString();

	return retval + "ForStatmentEnd \n";
}

list<IFinalNode* > ForStatement::eval(IData* data){
	list<IFinalNode* > finalnodes;
	int loopbegin;
	int loopend;
	if(this->begintype == LOOPNODE)
		loopbegin = this->loopbegin.uvnode->eval(data);
	else
		loopbegin = this->loopbegin.constant;

	if(this->endtype == LOOPNODE)
		loopend = this->loopend.uvnode->eval(data);
	else
		loopend = this->loopend.constant;

	data->put(this->loopvariable, loopbegin);
	while(data->getData(loopvariable, vector<int>()) <= loopend) {
		cout << "LoopValue = " << data->getData(loopvariable, vector<int>()) << endl;
		for (std::list<IStatement*>::iterator stit = this->statements.begin(); stit!=this->statements.end(); stit++){
			list<IFinalNode* > evalnodes = (*stit)->eval(data);
			finalnodes.insert(finalnodes.end(), evalnodes.begin(), evalnodes.end());
		}
		data->put(this->loopvariable, data->getData(loopvariable, vector<int>()) + 1);
	}
	return finalnodes;
}
