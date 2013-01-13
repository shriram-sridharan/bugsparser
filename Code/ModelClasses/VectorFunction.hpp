/*
 * VectorFunction.hpp
 *
 *  Created on: Jan 13, 2013
 *      Author: shriram
 */

#ifndef VECTORFUNCTION_HPP_
#define VECTORFUNCTION_HPP_

#include "IFunction.hpp"
#include "MultivariateNode.hpp"

class VectorFunction : public IFunction {
public:
	VectorFunction();
	virtual ~VectorFunction();
	string name;
	MultivariateNode* mvnode;
	string toString();
};

#endif /* VECTORFUNCTION_HPP_ */
