/*
 * StochasticNodeStatement.cpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#include "StochasticNodeStatement.hpp"

StochasticNodeStatement::StochasticNodeStatement() {
	// TODO Auto-generated constructor stub

}

StochasticNodeStatement::~StochasticNodeStatement() {
	// TODO Auto-generated destructor stub
}

string StochasticNodeStatement::toString(){
	string retval = "*StochasticNode : ";
	retval = retval + "Node = " + this->node->toString() + "\n Distribution= " + this->distribution->toString();
	return retval + "\n";
}
