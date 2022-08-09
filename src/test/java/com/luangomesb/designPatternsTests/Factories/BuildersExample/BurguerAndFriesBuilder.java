package com.luangomesb.designPatternsTests.Factories.BuildersExample;

public class BurguerAndFriesBuilder extends FastFoodMealBuilder {

  @Override
  public FastFood getMeal() {
    FastFood meal = new FastFood("X-Burguer", "Coke", "", "Ships");
    return meal;
  }
}
