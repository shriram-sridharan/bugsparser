/*
 * Statement.hpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#ifndef STATEMENT_HPP_
#define STATEMENT_HPP_
#include <string>
#include <list>
#include "../FinalClasses/IFinalNode.hpp"
#include "../DataClasses/IData.hpp"
using namespace std;

class IStatement {
public:
	virtual ~IStatement() {};
	virtual list<IFinalNode* > eval(IData* data) = 0;
	virtual string toString() = 0;
};

#endif /* STATEMENT_HPP_ */
