/*
 * LogicalNodeStatement.h
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef LOGICALNODESTATEMENT_H_
#define LOGICALNODESTATEMENT_H_

#include "INode.hpp"
#include "IStatement.hpp"
#include "LogicalNodeExpression.hpp"
#include <vector>

class LogicalNodeStatement : public IStatement{
public:
	LogicalNodeStatement();
	virtual ~LogicalNodeStatement();
	INode* logicalNode;
	LogicalNodeExpression* logicalnodeexp;
	list<IFinalNode* > eval(IData* data);
	string toString();
};

#endif /* LOGICALNODESTATEMENT_H_ */
