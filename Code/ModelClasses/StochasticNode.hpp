/*
 * StochasticNode.hpp
 *
 *  Created on: Jan 6, 2013
 *      Author: shriram
 */

#ifndef STOCHASTICNODE_HPP_
#define STOCHASTICNODE_HPP_

#include "Node.hpp"
#include "Distribution.hpp"

class StochasticNode : public Node {
public:
	virtual ~StochasticNode() {};
	Distribution distribution;
};

#endif /* STOCHASTICNODE_HPP_ */
