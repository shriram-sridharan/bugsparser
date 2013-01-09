/*
 * MainMemoryData.cpp
 *
 *  Created on: Jan 7, 2013
 *      Author: shrirams
 */

#include "MainMemoryData.hpp"

MainMemoryData::MainMemoryData() {
	// TODO Auto-generated constructor stub

}

MainMemoryData::~MainMemoryData() {
	// TODO Auto-generated destructor stub
}

float MainMemoryData::getData(std::string variablename, std::vector<int> indices){
	if(indices.size() == 0)
		return scalars[variablename];

	if(indices.size() == 1)
	{
		if(indices[0] > vectors[variablename].size())
			throw "Invalid dimension exception";
		return vectors[variablename][indices[0]-1];
	}

	return array[variablename]->getData(indices);
}
