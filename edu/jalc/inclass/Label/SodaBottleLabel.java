package edu.jalc.inclass.label;
public class SodaBottleLabel{

  private String brand;
  private Logo logo;
  private Ingredient ingredient;

  public SodaBottleLabel(String brand, Logo logo, Ingredient ingredient){
    this.brand = brand;
    this.logo = logo;
    this.ingredient = ingredient;
  }

  public String getBrand(){ return this.brand; }
  public Logo getLogo(){ return this.logo; }
  public Ingredient getIngredient(){ return this.ingredient; }

}
