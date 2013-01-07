/*
 * UnivariateNode.cpp
 *
 *  Created on: Jan 6, 2013
 *      Author: shriram
 */

#include "UnivariateNode.hpp"

UnivariateNode::UnivariateNode() {
	// TODO Auto-generated constructor stub

}

UnivariateNode::~UnivariateNode() {
	delete distribution;
	delete this;
}

