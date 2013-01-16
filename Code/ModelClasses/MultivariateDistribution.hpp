/*
 * MultivariateDistribution.hpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef MULTIVARIATEDISTRIBUTION_HPP_
#define MULTIVARIATEDISTRIBUTION_HPP_

#include "IDistribution.hpp"
#include "MVDParameters.hpp"

class MultivariateDistribution : public IDistribution {
public:
	MultivariateDistribution();
	virtual ~MultivariateDistribution();
	vector<MVDParameters* > distributionParameters;
	vector<DistParams* > evaluateParameters(IData* data);
	string toString();
};

#endif /* MULTIVARIATEDISTRIBUTION_HPP_ */
