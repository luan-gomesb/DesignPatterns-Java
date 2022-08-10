# Adapter Pattern

how a class can be reused even if hasn´t the interface required by the consumer?

How classes with incompatible interfaces can work together?

Solution:
define a adapter class that convert the interface into an compatible with required by the client

We can have adapter classes and object classes!

Object adapter will be a class that inplement one interface and use the other.

A Class adapter will be a subclass that implement the interface. So the class will work as a adpter.

Adapter allow the comunication between classes that do not would work together because incompatible interfaces

## Object Adapter

To make the comunication between the both interfaces, our adapter will ned to implement one interface, the cliente interface in general, and have the another interface as a attribute that will receive an object.
