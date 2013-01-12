/*
 * Statement.hpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#ifndef INODE_HPP_
#define INODE_HPP_

#include <string>
using namespace std;

class INode {
public:
	virtual ~INode(){};
	virtual string toString() = 0;
};

#endif
