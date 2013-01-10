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

class Program {
public:
	Program();
	virtual ~Program();
	list<IStatement*> statements;
};

#endif /* PROGRAM_HPP_ */
