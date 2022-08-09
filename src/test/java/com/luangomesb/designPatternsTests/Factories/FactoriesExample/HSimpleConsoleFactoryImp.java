package com.luangomesb.designPatternsTests.Factories.FactoriesExample;

import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Playstation;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Videogame;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Xbox;

public class HSimpleConsoleFactoryImp implements HSimpleConsoleFactory {

  @Override
  public Videogame getConsole(String model) {
    if ("X".equals(model))
      return new Xbox();

    if ("PS".equals(model))
      return new Playstation();

    return null;
  }

}