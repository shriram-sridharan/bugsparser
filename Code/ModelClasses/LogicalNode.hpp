/*
 * LogicalNode.hpp
 *
 *  Created on: Jan 6, 2013
 *      Author: shriram
 */

#ifndef LOGICALNODE_HPP_
#define LOGICALNODE_HPP_

#include "Node.hpp"
class LogicalNode : public Node {
public:
	LogicalNode();
	virtual ~LogicalNode();
	std::string functionname;
	std::vector<std::string> parentnodes;
	std::string expression;
};

#endif /* LOGICALNODE_HPP_ */
