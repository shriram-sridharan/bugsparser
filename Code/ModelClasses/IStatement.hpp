/*
 * Statement.hpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#ifndef STATEMENT_HPP_
#define STATEMENT_HPP_
#include <string>
using namespace std;

class IStatement {
public:
	virtual ~IStatement() {};
	virtual string toString() = 0;
};

#endif /* STATEMENT_HPP_ */
