/*
 * IDistribution.hpp
 *
 *  Created on: Jan 11, 2013
 *      Author: shrirams
 */

#ifndef IDISTRIBUTION_HPP_
#define IDISTRIBUTION_HPP_
#include <string>
#include <vector>
#include "../DataClasses/IData.hpp"
#include "../FinalClasses/StochasticNode.hpp"
using namespace std;

class IDistribution {
public :
	virtual ~IDistribution() {};
	string name;
	virtual string toString() = 0;
	virtual vector<DistParams* > evaluateParameters(IData* data) = 0;
};

#endif /* IDISTRIBUTION_HPP_ */
