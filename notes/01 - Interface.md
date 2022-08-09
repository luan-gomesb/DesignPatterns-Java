# Interfaces in Java

Interface é um termo geralmente usado para descrever o que um clinete usa.
Pode ser entendido como um contrato, que deve ser atendido pela implementação para poder ser utilizado.

Em Java, é uma palavra chave que precisamos para utilizar o conceito

## Programming to an interface
Programming to an interface really means program to a supertype

- The  declared type on sohould be the superclasses ou interfaces, not implementations
- The objects assigned to these interface should be concrete implementations.
- The class (client) should not know what is the implementations

That way we'll be able to use __polymorphism__. this mean we can have different implementations.


- do not declare variables to be concrete classes
  - use always interfaces os abstract classes

- Only program to interfaces no to implementation
  - this will make the programa be more flexible e able to be changed
  - we can change the implementations of the interfaces easily

- programming to interface is common on design patterns

- manipualte objects is beneficial for client
- the client don't need to know de details of implementation
- we reduce coupling
- makes the code mode generic, using supertypes
- it can change runtime


## Abstract Classes VS Interfaces

- Since Java 8, interfaces support default methods, what reduce the gap between both.
  - Before this, only abstract classes could have default methods

- Variables in interfaces are public tatic final
  - methods in abstract classes can be private and protected

- use abstract classes to establish relationship between interrelated objects
  - when you wnats to share a method among several related classes.

- Use interfaces do establish realtionship between unrelated objects
- Use a interface to especify a behavior of a datatype but are not concerned about the implementation.
- You can use interface to use multiple inheritance

### one is not bether than other

that only depends on for what you want to use
