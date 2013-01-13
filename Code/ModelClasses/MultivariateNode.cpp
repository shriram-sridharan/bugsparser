/*
 * MultivariateNode.cpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#include "MultivariateNode.hpp"


MultivariateNode::MultivariateNode() {
	// TODO Auto-generated constructor stub

}

MultivariateNode::~MultivariateNode() {
	// TODO Auto-generated destructor stub
}

string MultivariateNode::toString(){
	string retval = " ";
	retval = retval + this->nodeid + " ";
	for(vector<MultiDimExpression* >::iterator it=this->indices.begin();it!=this->indices.end(); ++it)
		retval = retval + (*it)->toString();

	return retval;
}
