/*
 * Node.hpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#ifndef NODE_HPP_
#define NODE_HPP_
using namespace std;

#include <vector>
#include <string>
#include "Expression.hpp"
#include "INode.hpp"

class UnivariateNode : public INode {
public:
	UnivariateNode();
	virtual ~UnivariateNode();
	string nodeid;
	vector<Expression* > indices;
	string toString();
};

#endif /* NODE_HPP_ */
