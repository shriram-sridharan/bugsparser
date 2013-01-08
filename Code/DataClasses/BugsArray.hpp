/*
 * BugsArray.hpp
 *
 *  Created on: Jan 7, 2013
 *      Author: shriram
 */

#ifndef BUGSARRAY_HPP_
#define BUGSARRAY_HPP_
#include <iostream>
#include <vector>
#include <string>
using namespace std;

class BugsArray {
public:
	BugsArray();
	virtual ~BugsArray();
	std::vector<float> data;
	std::vector<float> dimensions;
	bool checkDataAvailability();
	float getData(std::vector<int> location);
};

#endif /* BUGSARRAY_HPP_ */
