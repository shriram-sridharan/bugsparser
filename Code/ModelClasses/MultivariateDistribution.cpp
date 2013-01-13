/*
 * MultivariateDistribution.cpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#include "MultivariateDistribution.hpp"

MultivariateDistribution::MultivariateDistribution() {
	// TODO Auto-generated constructor stub

}

MultivariateDistribution::~MultivariateDistribution() {
	// TODO Auto-generated destructor stub
}


string MultivariateDistribution::toString() {
	string retval = " ";
	retval += this->name + " ";
	for(vector<MVDParameters*>::iterator it=this->distributionParameters.begin(); it!=this->distributionParameters.end(); ++it){
		if((*it)->type == MVNODE)
			retval = retval + (*it)->mvnode->toString() ;
		else
			retval = retval + (*it)->exp->toString();
	}
	return retval;
}

