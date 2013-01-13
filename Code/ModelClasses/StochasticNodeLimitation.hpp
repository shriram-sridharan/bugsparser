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
/*
 * LowerLimit/UpperLimit can only be Node/Constant. Cannot be an Expression
 */
class StochasticNodeLimitation {
public:
	StochasticNodeLimitation();
	virtual ~StochasticNodeLimitation();
	OptionalComponent optional;
	Expression* lowerlimit;
	Expression* upperlimit;
	string toString();
};

#endif /* STOCHASTICNODELIMITATION_HPP_ */
