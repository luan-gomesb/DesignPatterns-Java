# Factory Method

Pattern to handle the details of object creation.

- This pattern defines an interface for creatingan object , (Creator)

- Shen a class need to instantiate a subclass but don't know which one
  - the subclass will decide which class create

- Encapsulate the creation logic of the objects

- Factory is used in a lot frameworks

- Use the factory method when:
  - a class cannotanticiate the class of object it must create
  - a class wants its subclasses to specify the objects it creates

- also useful when you create parallel hierarchies

## Abstract Creator

with the abstract creator, we need a abstract factory class
we will need implement different concrete factories that will create our concrete objects

in this case, for each objet or group of objects we need a factory

This reduce reduce details on the client, but the client need to know the concrete factorys

# Abstract factory

With abstract factory we can use a family of objects that have a relationship.

Its a factory of factories

We define a interface wich these factorys implements and then, inject the needed factory on on client class

So, our factory will be abstract and we can use different factory to create differente objects without change client implementation

we can to combine different factories and create a suuperfactorie ta create combined factories dinamilcaly

As Factory Method:

- Encapsulate object creation
- mantain less coupling and lesse dependent impelmentation

Abstratc class delegates the responsability  of instantiation to anotherobject via composition

- provides an abstract type for creating a family of products (get the right factory)
- subclasses of this type define howthose product are produced
- Interfaces has to change if new producs are added

abstract class uses inheritance and relis on subclass to handle the object instantiation

use abstract classes to make sure client create objects that belong together
to decouple client from the classe you use to instantiate the object

use a factory when you wnat create multiple products with only one interface
