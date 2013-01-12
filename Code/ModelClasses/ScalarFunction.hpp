/*
 * ScalarFunction.hpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef SCALARFUNCTION_HPP_
#define SCALARFUNCTION_HPP_

#include "IFunction.hpp"
#include "LogicalNodeExpression.hpp"

class ScalarFunction : public IFunction{
public:
	ScalarFunction();
	virtual ~ScalarFunction();
	string name;
	LogicalNodeExpression* parameter;

	string toString();
};

#endif /* SCALARFUNCTION_HPP_ */
