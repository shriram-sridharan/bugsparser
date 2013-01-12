/*
 * LogicalNodeExpression.cpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#include "LogicalNodeExpression.hpp"
#include "UnivariateNode.hpp"
#include "ScalarFunction.hpp"
#include <sstream>
#include <typeinfo>

LogicalNodeExpression::LogicalNodeExpression() {
	// TODO Auto-generated constructor stub

}

LogicalNodeExpression::~LogicalNodeExpression() {
	// TODO Auto-generated destructor stub
}

string LogicalNodeExpression::toString(){
	string retval = "";
		if(this->type == LCONSTANT)
		{
			stringstream ss (stringstream::in | stringstream::out);
	        ss << this->expvalue;
			retval = retval + "Constant " + ss.str() + " ";
		}
		else if(this->type == LNODE)
		{
			retval = retval + "Node " ;
			if(typeid(*this->uvnode) == typeid(UnivariateNode)){
				retval = retval + ((UnivariateNode*)this->uvnode)->toString();
			}
		}
		else if(this->type == LFUNCTION)
		{
			retval = retval + "Function " ;
			if(typeid(*this->function) == typeid(ScalarFunction)){
				retval = retval + ((ScalarFunction*)this->function)->toString();
			}
		}
		else
		{
			retval = retval + "Expression " ;
			retval = retval + this->exp->toString();
		}

		if(!this->op.empty()){
			retval = retval + this->op + " " ;
			for(vector<LogicalNodeExpression*>::iterator it=this->children.begin(); it!=this->children.end(); ++it)
					retval = retval + (*it)->toString();

		}
		return retval;
}
