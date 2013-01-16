/*
 * Statement.hpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#ifndef INODE_HPP_
#define INODE_HPP_

#include <string>
#include "../DataClasses/IData.hpp"
using namespace std;

class INode {
public:
	virtual ~INode(){};
	virtual string toString() = 0;
	virtual string getNodeid(IData* data) = 0;
	virtual float eval(IData* data) = 0;
};

#endif
