package com.luangomesb.designPatterns.Factories.BuildersExample;

public abstract class FastFoodMealBuilder {

  public FastFood getMeal() {
    return new FastFood(null, null, null, null);
  }
}
