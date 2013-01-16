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
#include "../DataClasses/IData.hpp"
using namespace std;

enum ExpressionType { CONSTANT, NODE, EXPRESSION};
/*
 * Expression can be a float value or a node or an expression.
 * If Expression contains an operator, then it should contain children
 */
class Expression {
private:
	float operate(float previousvalue, string op, float newvalue);
public:
	Expression();
	virtual ~Expression();
	float expvalue;
	string op;
	INode* uvnode;
	Expression* exp;
	ExpressionType type;
	vector<Expression*> children;
	float eval(IData* data);
	string toString();
};

#endif /* EXPRESSION_HPP_ */
