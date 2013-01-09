/*
 * ExpressionNode.hpp
 *
 *  Created on: Jan 9, 2013
 *      Author: shrirams
 */

#ifndef EXPRESSIONNODE_HPP_
#define EXPRESSIONNODE_HPP_
#include <string>

enum ExpressionNodeType { NODE, NUMBER , FUNCTION, OPERATOR};

class ExpressionNode {
public:
	ExpressionNode(std::string nodename, ExpressionNodeType nodeType);
	virtual ~ExpressionNode();
	std::string nodename;
	ExpressionNodeType nodeType;
};

#endif /* EXPRESSIONNODE_HPP_ */
