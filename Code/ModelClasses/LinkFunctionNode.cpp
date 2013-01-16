/*
 * LinkFunctionNode.cpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#include "LinkFunctionNode.hpp"

LinkFunctionNode::LinkFunctionNode() {
	// TODO Auto-generated constructor stub

}

LinkFunctionNode::~LinkFunctionNode() {
	// TODO Auto-generated destructor stub
}

string LinkFunctionNode::toString(){
	string retval = " ";
	retval = retval + "LinkFunction = " + this->linkfunction + " Node= " + this->uvnode->toString();
	return retval;
}

float LinkFunctionNode::eval(IData* data){
	return 0;
}

string LinkFunctionNode::getNodeid(IData* data){
	return "";
}
