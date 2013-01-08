/*
 * BugsArray.cpp
 *
 *  Created on: Jan 7, 2013
 *      Author: shriram
 */

#include "BugsArray.hpp"

BugsArray::BugsArray() {
	// TODO Auto-generated constructor stub

}

BugsArray::~BugsArray() {
	// TODO Auto-generated destructor stub
}

bool BugsArray::checkDataAvailability(){
	int total = 1;
	for(std::vector<float>::iterator it = dimensions.begin(); it!=dimensions.end(); ++it) {
		total = total*(*it);
	}

	if(data.size() == size_t(total))
		return true;

	return false;
}

float BugsArray::getData(std::vector<int> location) {
	if(!checkDataAvailability())
		throw "Data from Model Incorrect";

	if(location.size()!=dimensions.size())
		throw "Invalid Dimension Exception";

	std::vector<float>::iterator dt=dimensions.begin();
	std::vector<int>::iterator it=location.begin();
	int dataloc = 0;
	for(;it!=location.end();++it,++dt){
		if((*it)> int (*dt))
			throw "Invalid Dimension Exception";
		if(it+1 != location.end())
			dataloc += ((*it) - 1)*(*dt);
		else
			dataloc += (*it) - 1;
	}

	return data[dataloc];
}
