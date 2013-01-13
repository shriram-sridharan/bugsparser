/*
 * StochasticNodeStatement.hpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#ifndef STOCHASTICNODESTATEMENT_HPP_
#define STOCHASTICNODESTATEMENT_HPP_

#include "IStatement.hpp"
#include "INode.hpp"
#include "IDistribution.hpp"
#include "StochasticNodeLimitation.hpp"

enum StochasticNodeLimitationType {NOLIMITATION, CENSOR, TRUNCATION};

class StochasticNodeStatement : public IStatement {
public:
	StochasticNodeStatement();
	virtual ~StochasticNodeStatement();
	INode* node;
	IDistribution* distribution;
	StochasticNodeLimitationType limitationType;
	StochasticNodeLimitation* limitation;
	string toString();
};

#endif /* STOCHASTICNODESTATEMENT_HPP_ */
