/*
 * Statement.h
 *
 *  Created on: Jan 5, 2013
 *      Author: shriram
 */

#ifndef STATEMENT_H_
#define STATEMENT_H_

#include "Node.hpp"
#include <vector>

class Statement {
public:
	Statement();
	virtual ~Statement();
	std::vector<Node> nodes;
};

#endif /* STATEMENT_H_ */
