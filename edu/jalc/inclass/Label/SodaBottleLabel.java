package edu.jalc.inclass.Label;

import edu.jalc.inclass.logo;
import edu.jalc.inclass.ingredient;

public class SodaBottleLabel{

   private String brand;
   private final Logo logo;
   private final Ingredient ingredient;

   public SodaBottleLabel(String brand, Logo logo, Ingredient ingredient){
      this.brand = brand;
      this.logo = logo;
      this.ingredient = ingredient;
   }

   public String getBrand(){
      return this.brand;
   }

   public Logo getLogo(){
      return this.logo;
   }

   public Ingredient getIngredient(){
      return this.ingredient;
   }

}
