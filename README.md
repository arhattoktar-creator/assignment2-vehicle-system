# Vehicle Management System

## Overview
This project was created as part of Assignment 2 for the Object-Oriented Programming course.
The goal of the project is to demonstrate basic OOP concepts such as inheritance, abstraction,
method overriding and object relationships in Java.

## Project Description
The system models different types of vehicles. An abstract Vehicle class is used as a base,
and Car, Motorcycle and Truck classes extend it. Each vehicle can be assigned a driver.
The program demonstrates polymorphism by storing different vehicle types in a single array.

## Class Structure
- Vehicle (abstract class)
- Car, Motorcycle, Truck (subclasses)
- Driver (associated class)

The abstract methods in the Vehicle class are implemented differently in each subclass.

## How to Run
Compile and run the program from the src directory:

javac *.java  
java Main  

## Program Output
The program starts and stops engines for different vehicles and prints vehicle
and driver information to the console.

## Reflection
Inheritance helped reduce code duplication by placing common fields in the Vehicle class.
Method overriding allowed each vehicle type to have its own implementation of engine behavior.
This assignment helped improve understanding of abstract classes and polymorphism.
