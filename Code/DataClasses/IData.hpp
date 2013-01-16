/*
 * IData.hpp
 *
 *  Created on: Jan 7, 2013
 *      Author: shrirams
 */

#ifndef IDATA_HPP_
#define IDATA_HPP_
#include <string>
#include <vector>

class IData {
	public:
		virtual ~IData() {};
		virtual float getData(std::string variablename, std::vector<int> indices) = 0;
		virtual bool contains(std::string variablename) = 0;
		virtual void put(std::string variablename, int value) = 0;
};

#endif /* IDATA_HPP_ */
