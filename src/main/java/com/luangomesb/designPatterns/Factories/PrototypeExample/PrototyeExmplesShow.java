package com.luangomesb.designPatterns.Factories.PrototypeExample;

public class PrototyeExmplesShow {
    public static void run(){
    try {
    UserPrototype user = new UserPrototype("Luan Gomes", new AddressPrototype("Street name", "009"));
    //the hallow copy keeps the same reference for attributes objects, like address
    UserPrototype user2 = user.shallowCopy();
    UserPrototype user3 = user.deepCopy();

    System.out.println("1 Prototype: " + user);
    user2.setName("new names");
    user2.getAddress().setNumber("10");


    user3.setName("deep copy example");
    user3.getAddress().setNumber("15");
    user3.getAddress().setStreet("deep cpy street");

    System.out.println("Prototype: " + user);
    System.out.println("shallow copy: " + user2);
    System.out.println("deep copy: " + user3);
    
    } catch (Exception e) {
      e.printStackTrace();
    }
  }


}
