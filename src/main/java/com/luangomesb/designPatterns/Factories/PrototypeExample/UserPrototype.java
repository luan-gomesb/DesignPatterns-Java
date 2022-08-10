package com.luangomesb.designPatterns.Factories.PrototypeExample;

public class UserPrototype implements Cloneable{
  private String name;
  private AddressPrototype address;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public AddressPrototype getAddress() {
    return address;
  }
  public void setAddress(AddressPrototype address) {
    this.address = address;
  }
  public UserPrototype(String name, AddressPrototype address) {
    this.name = name;
    this.address = address;
  }
  @Override
  public String toString() {
    return "UserPrototype [name=" + name + ", address=" + address + " ]";
  }

  
  public UserPrototype shallowCopy() throws CloneNotSupportedException{
    return (UserPrototype) super.clone();
  }
  public UserPrototype deepCopy() throws CloneNotSupportedException{
    //shallow copy of the ionstance
    UserPrototype clone =  (UserPrototype) super.clone();
    //make a clone of the attribute object at the clone
    // AddressPrototype addressCopy = this.getAddress().clone();
    clone.setAddress(this.getAddress().clone());
    return clone;
  }
}
