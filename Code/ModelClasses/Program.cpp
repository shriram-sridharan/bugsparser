/*
 * Program.cpp
 *
 *  Created on: Jan 5, 2013
 *      Author: shriram
 */

#include "Program.hpp"

Program::Program() {
	// TODO Auto-generated constructor stub

}

Program::~Program() {
	for (std::vector<Node*>::iterator it = nodes.begin(); it!= nodes.end(); ++it){
		delete *it;
	}
	delete this;
}
