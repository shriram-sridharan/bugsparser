/*
 * Node.h
 *
 *  Created on: Jan 6, 2013
 *      Author: shriram
 */

#ifndef NODE_H_
#define NODE_H_
#include <string>
#include <vector>

class Node {
public:
	virtual ~Node() {};
	std::string nodename;
	std::vector<int> parameters;
};

#endif /* NODE_H_ */
