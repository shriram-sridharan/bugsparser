/*
 * Expression.hpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#ifndef EXPRESSION_HPP_
#define EXPRESSION_HPP_

#include "INode.hpp"
#include <string>
#include <vector>
using namespace std;

enum ExpressionType { CONSTANT, NODE, EXPRESSION};

class Expression {
public:
	Expression();
	virtual ~Expression();
	float expvalue;
	string op;
	INode* uvnode;
	Expression* exp;
	ExpressionType type;
	vector<Expression*> children;

	string toString();
};

#endif /* EXPRESSION_HPP_ */
