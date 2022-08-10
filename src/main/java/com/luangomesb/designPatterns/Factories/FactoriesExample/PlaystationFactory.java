package com.luangomesb.designPatterns.Factories.FactoriesExample;

import com.luangomesb.designPatterns.Factories.FactoriesExample.ObjectsExamples.Playstation;
import com.luangomesb.designPatterns.Factories.FactoriesExample.ObjectsExamples.Videogame;

public class PlaystationFactory extends ConsoleFactory {

  @Override
  protected Videogame facMethod() {
    return new Playstation();
  }

}