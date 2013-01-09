/*
 * ExpressionNode.cpp
 *
 *  Created on: Jan 9, 2013
 *      Author: shrirams
 */

#include "ExpressionNode.hpp"

ExpressionNode::ExpressionNode(std::string nodename, ExpressionNodeType nodeType){
	this->nodename = nodename;
	this->nodeType = nodeType;
}

ExpressionNode::~ExpressionNode() {
	// TODO Auto-generated destructor stub
}
