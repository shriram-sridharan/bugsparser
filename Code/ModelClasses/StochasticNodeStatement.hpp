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

class StochasticNodeStatement : public IStatement {
public:
	StochasticNodeStatement();
	virtual ~StochasticNodeStatement();
	INode* node;
	IDistribution* distribution;
};

#endif /* STOCHASTICNODESTATEMENT_HPP_ */
