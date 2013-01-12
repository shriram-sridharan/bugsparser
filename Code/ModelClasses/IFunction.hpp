/*
 * IFunction.hpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef IFUNCTION_HPP_
#define IFUNCTION_HPP_
#include <string>
using namespace std;

class IFunction {
public:
	virtual ~IFunction(){};
	virtual string toString()=0;
};

#endif /* IFUNCTION_HPP_ */
