package com.luangomesb.designPatterns.Factories.FactoriesExample;

public class Xbox implements Videogame {
  @Override
  public void play() {
    System.out.println("Xbox Series X");
  }
}