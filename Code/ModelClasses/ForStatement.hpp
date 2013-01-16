/*
 * ForStatement.hpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef FORSTATEMENT_HPP_
#define FORSTATEMENT_HPP_
#include "IStatement.hpp"
#include "UnivariateNode.hpp"
#include <list>

enum LoopParamType { LOOPNODE, LOOPINT };
union LoopParam {
			UnivariateNode* uvnode;
			int constant;
		};

class ForStatement : public IStatement {
public:
	ForStatement();
	virtual ~ForStatement();
	string loopvariable;
	LoopParam loopbegin;
	LoopParam loopend;
	LoopParamType begintype;
	LoopParamType endtype;
	list<IStatement* > statements;
	list<IFinalNode* > eval(IData* data);
	string toString();
};

#endif /* FORSTATEMENT_HPP_ */
