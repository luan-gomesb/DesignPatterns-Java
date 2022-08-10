package com.luangomesb.designPatterns.Factories.FactoriesExample;

import com.luangomesb.designPatterns.Factories.FactoriesExample.ObjectsExamples.Videogame;
import com.luangomesb.designPatterns.Factories.FactoriesExample.ObjectsExamples.Xbox;

public class XboxFactory extends ConsoleFactory {

  @Override
  protected Videogame facMethod() {
    return new Xbox();
  }

}