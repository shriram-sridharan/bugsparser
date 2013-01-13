/*
 * VectorFunction.cpp
 *
 *  Created on: Jan 13, 2013
 *      Author: shriram
 */

#include "VectorFunction.hpp"

VectorFunction::VectorFunction() {
	// TODO Auto-generated constructor stub

}

VectorFunction::~VectorFunction() {
	// TODO Auto-generated destructor stub
}

string VectorFunction::toString(){
	string retval = " ";
	retval = retval + "Name = " + this->name + " Parameter= " + this->mvnode->toString();
	return retval;
}
