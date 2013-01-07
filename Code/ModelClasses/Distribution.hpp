/*
 * Distribution.h
 *
 *  Created on: Jan 6, 2013
 *      Author: shriram
 */

#ifndef DISTRIBUTION_H_
#define DISTRIBUTION_H_
#include <string>
#include <list>

class Distribution {
public:
	Distribution();
	virtual ~Distribution();
	std::string name;
	std::list<std::string> parameters;
};

#endif /* DISTRIBUTION_H_ */
