/*
 * DistParams.hpp
 *
 *  Created on: Jan 16, 2013
 *      Author: shriram
 */

#ifndef DISTPARAMS_HPP_
#define DISTPARAMS_HPP_
#include <string>
using namespace std;

enum DistParamType {DISTNODE, DISTCONSTANT};

class DistParams {
public:
	DistParams();
	virtual ~DistParams();
	string nodename;
	float value;
	DistParamType type;
};

#endif /* DISTPARAMS_HPP_ */
