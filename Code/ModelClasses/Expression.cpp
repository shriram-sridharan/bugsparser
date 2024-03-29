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
		string curoperator = this->op;
		for(vector<Expression*>::iterator it=this->children.begin(); it!=this->children.end(); ++it){
			previousvalue = this->operate(previousvalue, curoperator, (*it)->eval(data));
			curoperator = (*it)->op;
		}
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

DistParams* Expression::evalDistParams(IData* data){
	DistParams* distparams = new DistParams();
	if(this->type == CONSTANT) {
		distparams->value = this->expvalue;
		distparams->type = DISTCONSTANT;
	}
	else if(this->type == NODE){
		if(typeid(*this->uvnode) == typeid(UnivariateNode))
			distparams = ((UnivariateNode*)this->uvnode)->evalAsDistParam(data);
	}
	else
		distparams = this->exp->evalDistParams(data);

	if(!this->op.empty()){
		string curoperator = this->op;
		for(vector<Expression*>::iterator it=this->children.begin(); it!=this->children.end(); ++it){
			distparams->value = this->operate(distparams->value, curoperator, (*it)->eval(data));
			curoperator = (*it)->op;
		}
	}
	return distparams;
}
