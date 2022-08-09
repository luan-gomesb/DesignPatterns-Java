package com.luangomesb.designPatternsTests.Factories.FactoriesExample;

import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Playstation;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Videogame;

public class PlaystationFactory extends ConsoleFactory {

  @Override
  protected Videogame facMethod() {
    return new Playstation();
  }

}