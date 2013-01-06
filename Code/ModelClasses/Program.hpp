/*
 * Program.h
 *
 *  Created on: Jan 5, 2013
 *      Author: shriram
 */

#ifndef PROGRAM_H_
#define PROGRAM_H_

#include "Statement.hpp"
#include <iostream>
#include <vector>

class Program {
public:
	Program();
	virtual ~Program();
	std::vector<Statement> statements;
};

#endif /* PROGRAM_H_ */
