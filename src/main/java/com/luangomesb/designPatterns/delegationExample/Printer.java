package com.luangomesb.designPatterns.delegationExample;

class RealPrinter {
  // the delegate
  void print() {
    System.out.println("you delegated the print");
  }

}

public class Printer {
  // the delegator
  RealPrinter realPrinter = new RealPrinter();

  // create the delegate
  public void print() {
    realPrinter.print();// delegation
  }
}