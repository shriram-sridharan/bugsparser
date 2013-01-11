/*
 * Node.cpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#include "UnivariateNode.hpp"
#include <string>
#include <iostream>
using namespace std;

UnivariateNode::UnivariateNode() {

}

UnivariateNode::~UnivariateNode() {
}

string UnivariateNode::toString(){
	string retval = "";
	retval = retval + this->nodeid + " ";
	for(vector<Expression*>::iterator it=this->indices.begin(); it!=this->indices.end(); ++it){
		retval = retval + (*it)->toString() ;
	}
	return retval;
}
