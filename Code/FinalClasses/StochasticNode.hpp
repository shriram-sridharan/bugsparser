/*
 * StochasticNode.hpp
 *
 *  Created on: Jan 15, 2013
 *      Author: shriram
 */

#ifndef STOCHASTICNODE_HPP_
#define STOCHASTICNODE_HPP_

#include <string>
#include <vector>
#include "IFinalNode.hpp"
#include "DistParams.hpp"
using namespace std;

class StochasticNode : public IFinalNode {
public:
	StochasticNode();
	virtual ~StochasticNode();
	string nodename;
	string distributionname;
	vector<DistParams* > distributionparameters;
};

#endif /* STOCHASTICNODE_HPP_ */
