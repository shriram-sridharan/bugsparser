/*
 * ScalarFunction.cpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#include "ScalarFunction.hpp"

ScalarFunction::ScalarFunction() {
	// TODO Auto-generated constructor stub

}

ScalarFunction::~ScalarFunction() {
	// TODO Auto-generated destructor stub
}

string ScalarFunction::toString(){
	string retval = " ";
	retval = retval + "Name = " + this->name + " Parameter= " + this->parameter->toString();
	return retval;
}
