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
	if(this->optional!=UPPER){
		if(this->upperlimittype == LIMITNODE)
			retval = retval + "Node " +this->upperlimit->uvnode->toString() + " ";
		else {
			stringstream ss (stringstream::in | stringstream::out);
			ss << this->upperlimit->constant;
			retval = retval + "Constant " + ss.str() + " ";
		}
	}
	else if(this->optional!=LOWER){
		if(this->lowerlimittype == LIMITNODE)
			retval = retval + "Node " + this->lowerlimit->uvnode->toString() + " ";
		else {
			stringstream ss (stringstream::in | stringstream::out);
			ss << this->lowerlimit->constant;
			retval = retval + "Constant " + ss.str() + " ";
		}
	}
	return retval;
}
