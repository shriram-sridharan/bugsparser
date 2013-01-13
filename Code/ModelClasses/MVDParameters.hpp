/*
 * MVDParameters.hpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef MVDPARAMETERS_HPP_
#define MVDPARAMETERS_HPP_
#include "MultivariateNode.hpp"
#include "Expression.hpp"

enum MVDParamType {MVNODE, MVDEXPRESSION};

class MVDParameters {
public:
	MVDParameters();
	virtual ~MVDParameters();
	MultivariateNode* mvnode;
	Expression* exp;
	MVDParamType type;
};


#endif /* MVDPARAMETERS_HPP_ */
