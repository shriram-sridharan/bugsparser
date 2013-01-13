/*
 * MultiDimExpression.cpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#include "MultiDimExpression.hpp"

MultiDimExpression::MultiDimExpression() {
	// TODO Auto-generated constructor stub

}

MultiDimExpression::~MultiDimExpression() {
	// TODO Auto-generated destructor stub
}

string MultiDimExpression::toString(){
	string retval="";
	if(this->colon)
		retval = " Multidimension " + this->expbeforecolon->toString() + " : " + this->expaftercolon->toString();
	else
		retval = " Singledimension " + this->expbeforecolon->toString();

	return retval;
}
