/*
 * MultivariateNode.hpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef MULTIVARIATENODE_HPP_
#define MULTIVARIATENODE_HPP_

#include "INode.hpp"
#include "MultiDimExpression.hpp"
#include <vector>
using namespace std;

class MultivariateNode : public INode{
public:
	MultivariateNode();
	virtual ~MultivariateNode();
	string nodeid;
	vector<MultiDimExpression* > indices;
	string eval(IData* data);
	string toString();
};

#endif /* MULTIVARIATENODE_HPP_ */
