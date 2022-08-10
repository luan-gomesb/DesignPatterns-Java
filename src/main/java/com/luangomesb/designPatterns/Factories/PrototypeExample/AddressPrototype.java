package com.luangomesb.designPatterns.Factories.PrototypeExample;

public class AddressPrototype implements Cloneable{
  private String street;
  private String number;
  
  public AddressPrototype(String street, String number) {
    this.street = street;
    this.number = number;
  }
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }
  @Override
  public String toString() {
    return "AddressPrototype [number=" + number + ", street=" + street + "]";
  }

  public AddressPrototype clone() throws CloneNotSupportedException {
    return (AddressPrototype) super.clone();
  }
  
}
