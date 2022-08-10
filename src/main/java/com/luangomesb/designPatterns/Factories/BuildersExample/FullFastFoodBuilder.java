package com.luangomesb.designPatterns.Factories.BuildersExample;

public class FullFastFoodBuilder extends BurguerAndFriesBuilder {

  @Override
  public FastFood getMeal() {
    FastFood meal = new FastFood("Risoto", "Coke", "Salad", "Ships");
    return meal;
  }

}
