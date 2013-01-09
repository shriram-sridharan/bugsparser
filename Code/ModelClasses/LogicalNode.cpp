/*
 * LogicalNode.cpp
 *
 *  Created on: Jan 6, 2013
 *      Author: shriram
 */

#include "LogicalNode.hpp"
#include "../DataClasses/IData.hpp"
#include <iostream>
using namespace std;
LogicalNode::LogicalNode() {
	// TODO Auto-generated constructor stub

}

LogicalNode::~LogicalNode() {
	delete this;
}
/*
 * Get parent node pointers for all random variables in Expression Node.
 * To Do: Check in data nodes too.
 */
std::vector<Node*> LogicalNode::getParentNodes(std::vector<Node*> allmodelnodes){
	std::vector<Node*> parentnodes;
	int totalnodes = 0;
	for(std::vector<ExpressionNode*>::iterator eit=expressionnodes.begin(); eit!=expressionnodes.end(); ++eit) {
		std::string name = (*eit)->nodename;
		int sloc = name.find('[');
		if(sloc!=-1) {
			int eloc = name.find(']');
			name.substr(sloc+1, eloc-sloc-1);
			name = name.substr(0,sloc);
		}

		for(std::vector<Node*>::iterator it=allmodelnodes.begin(); it!=allmodelnodes.end(); ++it){
			if((*eit)->nodeType == NODE && name.compare((*it)->nodename) == 0) {
				parentnodes.push_back((*it));
			}
		}
		if((*eit)->nodeType == NODE)
			totalnodes+=1;
	}
//	if(parentnodes.size() != expressionnodes.size())
//		throw "Some nodes are unspecified in the definition of this logical node";

	return parentnodes;
}
