/*
 * Expression.cpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#include "Expression.hpp"
#include "UnivariateNode.hpp"
#include <string>
#include <typeinfo>
#include <sstream>
#include <iostream>
using namespace std;

Expression::Expression() {
	// TODO Auto-generated constructor stub

}

Expression::~Expression() {
	// TODO Auto-generated destructor stub
}

string Expression::toString() {
	string retval = "";
	if(this->type == CONSTANT)
	{
		stringstream ss (stringstream::in | stringstream::out);
        ss << this->expvalue;
		retval = retval + "Constant " + ss.str() + " ";
	}
	else if(this->type == NODE)
	{
		retval = retval + "Node " ;
		if(typeid(*this->uvnode) == typeid(UnivariateNode)){
			retval = retval + ((UnivariateNode*)this->uvnode)->toString();
		}
	}
	else
	{
		retval = retval + "Expression " ;
		retval = retval + this->exp->toString();
	}

	if(!this->op.empty()){
		retval = retval + this->op + " " ;
		for(vector<Expression*>::iterator it=this->children.begin(); it!=this->children.end(); ++it)
				retval = retval + (*it)->toString();
	}
	return retval;
}
