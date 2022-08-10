# Singleton

The objective of singleton is to have one unique instance of a classe.

In generall this class is Public and used to have limited conects, manage acess to files, logs etc

Is util to manage Global values that change during the application running

We can have a theme in a single class, every component who use this value, wuld get the updated status of the theme easily.

We do that setting the constructor os the class as a private, and seting a static method that return the instance of class

This classe has statics values and every time a client acess the client, the client return this static value

At the first time the client use the singleton class, this autocreate a instance, fo every futher use, will be returned the value of the instance already existent.

The attributes you sabe on this class dont need to be statics, only the instance of the classe that you need to create

To iniciate attributes non static of the class, simple use the construtor, on the static constuctor you will call the constructor
