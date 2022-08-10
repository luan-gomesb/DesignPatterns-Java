# Prototype

 Create a object from a prototype with existent default values, so improve to the desired object.

 Clone and evolve.

 We'll make a copy to use.

Create a new object from an existent instance.


In Java we have a standard implementation interface thats provides a clone function to our class, wich make esy to use our class

We just need to implement the Cloneable interface to make clones from out object.

```Java
public class MyObject implements Cloneable {
  // class implementation .....
  public Object getclone(){
    return super.clone();
  }
}
```

This method will return a object thats is a shallow copy from the instance os MyObject;

```Java
public static void main(String[] args){
    MyObject obj1 =  new MyObject();
    // this will make a copy of the prototype objects
    MyObject obj2 = (MyObject) obj1.getClone();
}
```

## Shallow copy or Deep copy

With a shallow copy, only the object will be copied. If the object copied have another object as attributes, this attribute will be the same of the cloned object, it will have the same reference.

In the Deep Copy, we have do make copies of the objects and the attributes that are another objects.

The Cloneable interface does not make it automatically, we have to implement if we want;

To make it easy, we can make the attribute classes implements cloneable too and change only the main prototype.

