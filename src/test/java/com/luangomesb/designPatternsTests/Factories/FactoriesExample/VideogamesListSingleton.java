package com.luangomesb.designPatternsTests.Factories.FactoriesExample;

import java.util.ArrayList;
import java.util.List;

import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Videogame;

public class VideogamesListSingleton {
  private static VideogamesListSingleton _instance;
  private List<Videogame> videogames;

  private VideogamesListSingleton() {
    videogames = new ArrayList<>();
  }

  public static VideogamesListSingleton getInstance() {
    if (_instance == null) {
      _instance = new VideogamesListSingleton();
    }
    return _instance;
  }

  public List<Videogame> getVideogames() {
    return videogames;
  }

}
