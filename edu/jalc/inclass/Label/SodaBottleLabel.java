package edu.jalc.inclass.label;
public class SodaBottleLabel{

  private String brand;
  private Logo logo;
  private Ingredients ingredients;

  private SodaBottleLabel(String brand, Logo logo, Ingredients ingredients){
    this.brand = brand;
    this.logo = logo;
    this.ingredients = ingredients;
  }

  public String getBrand(){ return this.brand; }
  public Logo getLogo(){ return this.logo; }
  public Ingredients getIngredients(){ return this.ingredients; }

}
