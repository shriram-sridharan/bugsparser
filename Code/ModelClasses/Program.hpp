/*
 * Program.hpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#ifndef PROGRAM_HPP_
#define PROGRAM_HPP_
using namespace std;

#include <list>
#include "IStatement.hpp"
#include "../DataClasses/IData.hpp"
#include "../FinalClasses/IFinalNode.hpp"

class Program {
public:
	Program();
	virtual ~Program();
	list<IStatement* > statements;
	list<IFinalNode* > eval(IData* data);
};

#endif /* PROGRAM_HPP_ */
