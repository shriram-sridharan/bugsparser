/*
 * UnivariateDistribution.hpp
 *
 *  Created on: Jan 11, 2013
 *      Author: shrirams
 */

#ifndef UNIVARIATEDISTRIBUTION_HPP_
#define UNIVARIATEDISTRIBUTION_HPP_

#include "IDistribution.hpp"
#include "Expression.hpp"
#include <vector>

class UnivariateDistribution : public IDistribution {
public:
	UnivariateDistribution();
	virtual ~UnivariateDistribution();
	vector<Expression* > distributionParameters;
	vector<DistParams* > evaluateParameters(IData* data);
	string toString();
};

#endif /* UNIVARIATEDISTRIBUTION_HPP_ */
