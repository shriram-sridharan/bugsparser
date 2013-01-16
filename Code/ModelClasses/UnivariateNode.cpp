/*
 * Node.cpp
 *
 *  Created on: Jan 10, 2013
 *      Author: shrirams
 */

#include "UnivariateNode.hpp"
#include <string>
#include <iostream>
#include <sstream>
using namespace std;

UnivariateNode::UnivariateNode() {

}

UnivariateNode::~UnivariateNode() {
}

string UnivariateNode::toString(){
	string retval = "";
	retval = retval + this->nodeid + " ";
	for(vector<Expression*>::iterator it=this->indices.begin(); it!=this->indices.end(); ++it){
		retval = retval + (*it)->toString() ;
	}
	return retval;
}

float UnivariateNode::eval(IData* data){
	string nodename = this->nodeid;
	vector<int> parameters;
	for(vector<Expression*>::iterator it=this->indices.begin(); it!=this->indices.end(); ++it){
		parameters.push_back((*it)->eval(data));
	}
	return data->getData(nodename, parameters);
}

string UnivariateNode::getNodeid(IData* data){
	string nodename = this->nodeid;
	if(this->indices.size()>0){
		nodename += "[";
		for(vector<Expression*>::iterator it=this->indices.begin(); it!=this->indices.end(); ++it){
			stringstream ss (stringstream::in | stringstream::out);
			ss << (*it)->eval(data);
			nodename = nodename + ss.str();
			if((it+1)!=this->indices.end())
				nodename += ",";
		}
		nodename += "]";
	}
	return nodename;
}

DistParams* UnivariateNode::evalAsDistParam(IData* data){
	DistParams* distparams = new DistParams();
	string nodename = this->nodeid;
	vector<int> parameters;
	for(vector<Expression*>::iterator it=this->indices.begin(); it!=this->indices.end(); ++it){
		parameters.push_back((*it)->eval(data));
	}
	if(data->contains(nodename)){
		distparams->value = data->getData(nodename, parameters);
		distparams->type = DISTCONSTANT;
	}
	else{
		distparams->nodename = getNodeid(data);
		distparams->type = DISTNODE;
	}
	return distparams;
}
