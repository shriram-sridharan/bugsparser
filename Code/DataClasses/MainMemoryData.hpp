/*
 * MainMemoryData.hpp
 *
 *  Created on: Jan 7, 2013
 *      Author: shrirams
 */

#ifndef MAINMEMORYDATA_HPP_
#define MAINMEMORYDATA_HPP_
#include "IData.hpp"
#include "BugsArray.hpp"
#include <map>
#include <string>
#include <vector>

using namespace std;

class MainMemoryData : public IData {
public:
	MainMemoryData();
	virtual ~MainMemoryData();
	map<std::string, float> scalars;
	map<std::string, vector<float> > vectors;
	map<std::string, BugsArray* > array;
	map<std::string, int > temporaryvalues;

	float getData(std::string variablename, vector<int> indices);
	bool contains(std::string variablename);
	void put(std::string variablename, int value);
};

#endif /* MAINMEMORYDATA_HPP_ */
