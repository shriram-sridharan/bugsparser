/*
 * LogicalNodeStatement.h
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#ifndef LOGICALNODESTATEMENT_H_
#define LOGICALNODESTATEMENT_H_

#include "INode.hpp"

class LogicalNodeStatement {
public:
	LogicalNodeStatement();
	virtual ~LogicalNodeStatement();
	INode* logicalNode;
};

#endif /* LOGICALNODESTATEMENT_H_ */
