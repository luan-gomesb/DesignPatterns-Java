package com.luangomesb.designPatterns.Factories.BuildersExample;

public class BuilderExampleShow {
   public static void run(){
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


}
