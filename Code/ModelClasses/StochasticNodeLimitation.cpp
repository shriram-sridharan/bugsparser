/*
 * StochasticNodeLimitation.cpp
 *
 *  Created on: Jan 13, 2013
 *      Author: shriram
 */

#include "StochasticNodeLimitation.hpp"
#include <sstream>

StochasticNodeLimitation::StochasticNodeLimitation() {
	// TODO Auto-generated constructor stub

}

StochasticNodeLimitation::~StochasticNodeLimitation() {
	// TODO Auto-generated destructor stub
}

string StochasticNodeLimitation::toString(){
	string retval = "";
	if(this->optional!=LOWER)
		retval = retval + " LowerLimit= " + this->lowerlimit->toString();
	if(this->optional!=UPPER)
		retval = retval + " UpperLimit= " + this->upperlimit->toString();
	return retval;
}
