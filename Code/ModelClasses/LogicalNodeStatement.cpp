/*
 * LogicalNodeStatement.cpp
 *
 *  Created on: Jan 12, 2013
 *      Author: shriram
 */

#include "LogicalNodeStatement.hpp"

LogicalNodeStatement::LogicalNodeStatement() {
	// TODO Auto-generated constructor stub

}

LogicalNodeStatement::~LogicalNodeStatement() {
	// TODO Auto-generated destructor stub
}

string LogicalNodeStatement::toString(){
	string retval = "*LogicalNode :  ";
	retval = retval + " Name = " + this->logicalNode->toString() + "\n Expression = " + this->logicalnodeexp->toString();
	return retval+"\n";
}
