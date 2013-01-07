################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
CPP_SRCS += \
../DataClasses/MainMemoryData.cpp 

OBJS += \
./DataClasses/MainMemoryData.o 

CPP_DEPS += \
./DataClasses/MainMemoryData.d 


# Each subdirectory must supply rules for building sources it contributes
DataClasses/%.o: ../DataClasses/%.cpp
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C++ Compiler'
	g++ -I/afs/cs.wisc.edu/u/s/h/shrirams/bugsparser/Code/include -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o"$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


