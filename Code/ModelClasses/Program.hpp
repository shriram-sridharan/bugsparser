/*
 * Program.h
 *
 *  Created on: Jan 5, 2013
 *      Author: shriram
 */

#ifndef PROGRAM_H_
#define PROGRAM_H_

#include <iostream>
#include <list>
#include "Node.hpp"
#include "StochasticNode.hpp"
#include "UnivariateNode.hpp"

class Program {
public:
	Program();
	virtual ~Program();
	std::list<Node> nodes;
};

#endif /* PROGRAM_H_ */
