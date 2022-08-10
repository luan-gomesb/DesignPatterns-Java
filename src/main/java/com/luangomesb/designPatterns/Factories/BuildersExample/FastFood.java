package com.luangomesb.designPatterns.Factories.BuildersExample;

public class FastFood {
  private String main;
  private String drink;
  private String entry;
  private String fries;

  public FastFood(String main, String drink, String entry, String fries) {
    this.main = main;
    this.drink = drink;
    this.entry = entry;
    this.fries = fries;
  }

  public String getMain() {
    return main;
  }

  public void setMain(String main) {
    this.main = main;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String getEntry() {
    return entry;
  }

  public void setEntry(String entry) {
    this.entry = entry;
  }

  public String getFries() {
    return fries;
  }

  public void setFries(String fries) {
    this.fries = fries;
  }

  @Override
  public String toString() {
    return "FastFoodMeal [drink=" + drink + ", entry=" + entry + ", fries=" + fries + ", main=" + main + "]";
  }

}
