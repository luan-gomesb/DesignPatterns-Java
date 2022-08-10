package com.luangomesb.designPatterns.Factories.BuildersExample;

public class FastFoodBuilderFluent {
  protected FastFood meal;

  public FastFoodBuilderFluent() {
    meal = new FastFood(null, null, null, null);
  }

  public FastFoodBuilderFluent setMain(String main) {
    this.meal.setMain(main);
    return this;
  }

  public FastFoodBuilderFluent setDrink(String drink) {
    this.meal.setDrink(drink);
    return this;
  }

  public FastFoodBuilderFluent setEntry(String entry) {
    this.meal.setEntry(entry);
    return this;
  }

  public FastFoodBuilderFluent setFries(String fries) {
    this.meal.setFries(fries);
    return this;
  }

  public FastFood getFastFood() {
    return this.meal;
  }

}
