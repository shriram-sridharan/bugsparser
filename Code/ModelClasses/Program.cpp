/*
 * Program.cpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#include "Program.hpp"

Program::Program() {
	// TODO Auto-generated constructor stub

}

Program::~Program() {
	std::list<IStatement*>::iterator it;
	for(it = this->statements.begin(); it!=this->statements.end(); ++it){
		delete *it;
	}
}

list<IFinalNode* > Program::eval(IData* data){
	list<IFinalNode* > finalnodes;
	std::list<IStatement*>::iterator it;
	for(it = this->statements.begin(); it!=this->statements.end(); ++it){
		if((*it)->eval(data).size() != 0){
			list<IFinalNode* > evaluatednodes = (*it)->eval(data);
			finalnodes.insert(finalnodes.end(), evaluatednodes.begin(), evaluatednodes.end());
		}
	}
	return finalnodes;
}
