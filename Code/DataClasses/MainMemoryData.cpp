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

float MainMemoryData::getData(std::string variablename){
	return scalars[variablename];
}
