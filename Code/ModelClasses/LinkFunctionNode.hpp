/*
 * LinkFunctionNode.hpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef LINKFUNCTIONNODE_HPP_
#define LINKFUNCTIONNODE_HPP_
#include "INode.hpp"
#include <string>
#include "UnivariateNode.hpp"
using namespace std;

class LinkFunctionNode : public INode{
public:
	LinkFunctionNode();
	virtual ~LinkFunctionNode();
	string linkfunction;
	UnivariateNode uvnode;
};

#endif /* LINKFUNCTIONNODE_HPP_ */
