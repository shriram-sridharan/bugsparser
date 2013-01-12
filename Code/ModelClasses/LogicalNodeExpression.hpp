/*
 * LogicalNodeExpression.hpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef LOGICALNODEEXPRESSION_HPP_
#define LOGICALNODEEXPRESSION_HPP_
#include "INode.hpp"
#include "IFunction.hpp"
#include <vector>

enum LogicalNodeExpressionType {LCONSTANT, LNODE, LFUNCTION, LEXPRESSION};

class LogicalNodeExpression {
public:
	LogicalNodeExpression();
	virtual ~LogicalNodeExpression();

	float expvalue;
	INode* uvnode;
	IFunction* function;
	LogicalNodeExpression* exp;
	LogicalNodeExpressionType type;

	string op;
	vector<LogicalNodeExpression*> children;

	string toString();
};

#endif /* LOGICALNODEEXPRESSION_HPP_ */
