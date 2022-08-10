package com.luangomesb.designPatterns.Factories.FactoriesExample;

import com.luangomesb.designPatterns.Factories.FactoriesExample.ObjectsExamples.Videogame;

public abstract class ConsoleFactory {
  protected abstract Videogame facMethod();

  public Videogame getConsole() {
    return facMethod();
  }

}