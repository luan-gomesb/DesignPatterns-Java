package com.luangomesb.designPatternsTests;

import com.luangomesb.designPatternsTests.Factories.BuildersExample.BurguerAndFriesBuilder;
import com.luangomesb.designPatternsTests.Factories.BuildersExample.FastFood;
import com.luangomesb.designPatternsTests.Factories.BuildersExample.FastFoodBuilderFluent;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.*;
import com.luangomesb.designPatternsTests.Factories.FactoriesExample.ObjectsExamples.Videogame;

public class Client {
  public static void main(String[] args) {

    FastFood meal = new FastFoodBuilderFluent()
        .setDrink("Coke")
        .setEntry("salad")
        .setFries("Ships")
        .setMain("burguer")
        .getFastFood();
    System.out.println(meal.toString());
    FastFood meal2 = new BurguerAndFriesBuilder().getMeal();
    System.out.println(meal2);
  }

  private static void testFactories() {
    Videogame play = new PlaystationFactory().getConsole();
    play.play();
    var xbox = new XboxFactory().getConsole();
    xbox.play();

    // half simple implementario
    // we dont we dont need one factory for each object
    var ps = new HSimpleConsoleFactoryImp().getConsole("PS");
    ps.play();
    // concrete factory - an interface is also optional
    var concreteXbox = ConsoleConcreteFactory.getConsole("X");
    concreteXbox.play();
    // the big change is, our factor receive a parameter do define wich object to
    // return
    var list = VideogamesListSingleton.getInstance();
    list.getVideogames().add(concreteXbox);

    var list2 = VideogamesListSingleton.getInstance();
    System.out.println("\nLista of consoles: ");
    System.out.println(list2.getVideogames().size());
    System.out.println("\nare the same instance: " + (list == list2));

  }
}
