package com.luangomesb.designPatternsTests.Factories.FactoriesExample;

import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Videogame;

public abstract class ConsoleFactory {
  protected abstract Videogame facMethod();

  public Videogame getConsole() {
    return facMethod();
  }

}