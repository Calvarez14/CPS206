package edu.jalc.inclass.ingredient;


public class Ingredient{

   private final String ingredient;

   private Ingredient(){
      this.ingredient = null;
   }

   public Ingredient(String ingredient){
      this.ingredient = ingredient;
   }

   public String getIngredient(){
      return this.ingredient;
   }
}
