################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../ModelClasses/Distribution.cpp \
../ModelClasses/LogicalNode.cpp \
../ModelClasses/MultivariateDistribution.cpp \
../ModelClasses/MultivariateNode.cpp \
../ModelClasses/Program.cpp \
../ModelClasses/UnivariateDistribution.cpp \
../ModelClasses/UnivariateNode.cpp 

OBJS += \
./ModelClasses/Distribution.o \
./ModelClasses/LogicalNode.o \
./ModelClasses/MultivariateDistribution.o \
./ModelClasses/MultivariateNode.o \
./ModelClasses/Program.o \
./ModelClasses/UnivariateDistribution.o \
./ModelClasses/UnivariateNode.o 

CPP_DEPS += \
./ModelClasses/Distribution.d \
./ModelClasses/LogicalNode.d \
./ModelClasses/MultivariateDistribution.d \
./ModelClasses/MultivariateNode.d \
./ModelClasses/Program.d \
./ModelClasses/UnivariateDistribution.d \
./ModelClasses/UnivariateNode.d 


# Each subdirectory must supply rules for building sources it contributes
ModelClasses/%.o: ../ModelClasses/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -I/afs/cs.wisc.edu/u/s/h/shrirams/bugsparser/Code/include -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


