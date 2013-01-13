/*
 * StochasticNodeLimitation.hpp
 *
 *  Created on: Jan 13, 2013
 *      Author: shriram
 */

#ifndef STOCHASTICNODELIMITATION_HPP_
#define STOCHASTICNODELIMITATION_HPP_
#include "UnivariateNode.hpp"

enum OptionalComponent {NOOPTIONAL, UPPER, LOWER};
enum LimitationDataType { LIMITNODE, LIMITCONSTANT };

union LimitationData {
	UnivariateNode* uvnode;
	float constant;
};

class StochasticNodeLimitation {
public:
	StochasticNodeLimitation();
	virtual ~StochasticNodeLimitation();
	OptionalComponent optional;
	LimitationData* lowerlimit;
	LimitationDataType lowerlimittype;
	LimitationData* upperlimit;
	LimitationDataType upperlimittype;
	string toString();
};

#endif /* STOCHASTICNODELIMITATION_HPP_ */
