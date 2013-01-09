/*
 * LogicalNode.hpp
 *
 *  Created on: Jan 6, 2013
 *      Author: shriram
 */

#ifndef LOGICALNODE_HPP_
#define LOGICALNODE_HPP_
#include "Node.hpp"
#include "ExpressionNode.hpp"

class LogicalNode : public Node {
public:
	LogicalNode();
	virtual ~LogicalNode();
	std::string functionname;
	std::vector<ExpressionNode*> expressionnodes;
	std::vector<Node*> getParentNodes(std::vector<Node*> allmodelnodes);
};

#endif /* LOGICALNODE_HPP_ */
