package com.luangomesb.designPatternsTests.Factories.FactoriesExample;

import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Videogame;

public interface HSimpleConsoleFactory {
  public Videogame getConsole(String model);
}
