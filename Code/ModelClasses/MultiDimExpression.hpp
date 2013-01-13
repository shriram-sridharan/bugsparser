/*
 * MultiDimExpression.hpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef MULTIDIMEXPRESSION_HPP_
#define MULTIDIMEXPRESSION_HPP_

#include "Expression.hpp"
/*
 * Multidimensional expression can contain expression:expression or only expression
 * However a multivariate node should contain atleast one Multidimensional expression with a colon
 */

class MultiDimExpression {
public:
	MultiDimExpression();
	virtual ~MultiDimExpression();
	Expression* expbeforecolon;
	Expression* expaftercolon;
	bool colon;
	string toString();
};

#endif /* MULTIDIMEXPRESSION_HPP_ */
