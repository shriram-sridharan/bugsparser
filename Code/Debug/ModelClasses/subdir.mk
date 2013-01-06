################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../ModelClasses/Distribution.cpp \
../ModelClasses/LogicalNode.cpp \
../ModelClasses/MultivariateNode.cpp \
../ModelClasses/Node.cpp \
../ModelClasses/Program.cpp \
../ModelClasses/Statement.cpp \
../ModelClasses/StochasticNode.cpp \
../ModelClasses/UnivariateNodeWithCensor.cpp \
../ModelClasses/UnivariateNodeWithTruncation.cpp 

OBJS += \
./ModelClasses/Distribution.o \
./ModelClasses/LogicalNode.o \
./ModelClasses/MultivariateNode.o \
./ModelClasses/Node.o \
./ModelClasses/Program.o \
./ModelClasses/Statement.o \
./ModelClasses/StochasticNode.o \
./ModelClasses/UnivariateNodeWithCensor.o \
./ModelClasses/UnivariateNodeWithTruncation.o 

CPP_DEPS += \
./ModelClasses/Distribution.d \
./ModelClasses/LogicalNode.d \
./ModelClasses/MultivariateNode.d \
./ModelClasses/Node.d \
./ModelClasses/Program.d \
./ModelClasses/Statement.d \
./ModelClasses/StochasticNode.d \
./ModelClasses/UnivariateNodeWithCensor.d \
./ModelClasses/UnivariateNodeWithTruncation.d 


# Each subdirectory must supply rules for building sources it contributes
ModelClasses/%.o: ../ModelClasses/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -I/home/shriram/bugsparser/Parser/output/include -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


