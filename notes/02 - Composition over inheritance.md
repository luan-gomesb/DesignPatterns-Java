# Composition over Inheritance

## Composition

Is as "Has a" relationship between classes.

One object contain another object
- Composition implies a relationship that where the child cannot existi independent to father
  - something is part of another
  - ex: rooms cannot exist outside the House 

Composition is used in many design patterns

## Aggregation

Aggregation is also a "HAS-A" relationship between objects.

The difference is, the child object can exist without the father

ex: A airport has a list of planes

the plane continues to exist out of the airport


## Composition over inheritance

- Composition keeps class encapsulated and focused on one tasks
- Inheritance breaks encapsulation because one depend on another
- Inheritance couple 
  - If as superclass changes, the child may be broken 

- Java does not support multiple inheritance
  - Some design patterns use this

- Most design patterns use composition
  - Strategy
  - Decorator
  - If Design patterns use composition then that means it has been tried and tested

- Composition offer better test-ability of a class than when using Inheritance
  - easily mock implementations
  - Inheritance is harder to test
  - Unit testing is one of the most important things to consider during software development
    - Test drive development is huge and important 
- Composition allows to reuse a final class


