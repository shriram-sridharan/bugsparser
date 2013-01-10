/*
 * Node.cpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#include "UnivariateNode.hpp"

UnivariateNode::UnivariateNode(string nodeid, vector<Expression> indices) {
	this->indices = indices;
	this->nodeid = nodeid;
}

UnivariateNode::~UnivariateNode() {
	delete this;
}
