/*
 * IData.hpp
 *
 *  Created on: Jan 7, 2013
 *      Author: shrirams
 */

#ifndef IDATA_HPP_
#define IDATA_HPP_
#include <string>

class IData {
	public:
		virtual ~IData() {};
		virtual float getData(std::string variablename) = 0;
};

#endif /* IDATA_HPP_ */
