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

float Expression::eval(IData* data) {
	float previousvalue;
	if(this->type == CONSTANT)
		previousvalue = this->expvalue;
	else if(this->type == NODE){
		if(typeid(*this->uvnode) == typeid(UnivariateNode))
			previousvalue = ((UnivariateNode*)this->uvnode)->eval(data);
	}
	else
		previousvalue = this->exp->eval(data);

	if(!this->op.empty()){
		float value;
		for(vector<Expression*>::iterator it=this->children.begin(); it!=this->children.end(); ++it){
				value = this->operate(value, (*it)->op, (*it)->eval(data));
		}
		previousvalue = this->operate(previousvalue, this->op, value);
	}
	return previousvalue;
}

float Expression::operate(float previousvalue, string op, float newvalue){
	if(op=="+")
		return previousvalue+newvalue;
	if(op=="-")
		return previousvalue-newvalue;
	if(op=="*")
		return previousvalue*newvalue;
	if(op=="/")
		return previousvalue/newvalue;
	return newvalue;
}
