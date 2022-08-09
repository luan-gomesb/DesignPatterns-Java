package com.luangomesb.designPatternsTests.Factories.FactoriesExample;

import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Videogame;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Xbox;

public class XboxFactory extends ConsoleFactory {

  @Override
  protected Videogame facMethod() {
    return new Xbox();
  }

}