package com.luangomesb.designPatterns.Factories.FactoriesExample;

import com.luangomesb.designPatterns.Factories.FactoriesExample.ObjectsExamples.Videogame;

public interface HSimpleConsoleFactory {
  public Videogame getConsole(String model);
}
