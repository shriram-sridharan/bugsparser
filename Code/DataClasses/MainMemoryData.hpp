/*
 * MainMemoryData.hpp
 *
 *  Created on: Jan 7, 2013
 *      Author: shrirams
 */

#ifndef MAINMEMORYDATA_HPP_
#define MAINMEMORYDATA_HPP_
#include "IData.hpp"
#include <map>
#include <string>

using namespace std;

class MainMemoryData : public IData {
public:
	MainMemoryData();
	virtual ~MainMemoryData();
	map<std::string, float> scalars;
	float getData(std::string variablename);
};

#endif /* MAINMEMORYDATA_HPP_ */
