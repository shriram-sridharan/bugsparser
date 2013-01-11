/*
 * UnivariateDistribution.cpp
 *
 *  Created on: Jan 11, 2013
 *      Author: shrirams
 */

#include "UnivariateDistribution.hpp"

UnivariateDistribution::UnivariateDistribution() {
	// TODO Auto-generated constructor stub

}

UnivariateDistribution::~UnivariateDistribution() {
	// TODO Auto-generated destructor stub
}

string UnivariateDistribution::toString() {
	string retval = " ";
	retval += this->name + " ";
	for(vector<Expression*>::iterator it=this->distributionParameters.begin(); it!=this->distributionParameters.end(); ++it){
			retval = retval + (*it)->toString() ;
		}
	return retval;
}
