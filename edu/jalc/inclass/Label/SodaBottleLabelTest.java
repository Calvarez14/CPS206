package edu.jalc.inclass.label;

import edu.jalc.inclass.logo.Logo;
import edu.jalc.inclass.ingredient.Ingredient;

public class SodaBottleLabelTest{

   public void testGetBrand(){
      System.out.println("Testing SodaBottleLabel: :getTestBrand");
      Logo logo = new Logo(15);
      Ingredient ingredient = new Ingredient("Water");
      SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Fanta",logo,ingredient);
      String fanta = "Fanta";
      assert(sodaBottleLabel.getBrand().equals(fanta));
   }

   public void testGetLogo(){
     System.out.println("Testing SodaBottleLabel: :getTestLogo");
     Logo logo = new Logo(15);
     Ingredient ingredient = new Ingredient("Water");
     SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Fanta",logo,ingredient);
     assert(logo.equals(sodaBottleLabel.getLogo()));
   }

   public void testGetIngredient(){
      System.out.println("Testting SodaBottleLabel: :getTestIngredient");
      Logo logo = new Logo(15);
      Ingredient ingredient = new Ingredient("Water");
      SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Fanta",logo,ingredient);
      assert(ingredient.equals(sodaBottleLabel.getIngredient()));
   }

   public static void main(String... args) throws Exception{
      SodaBottleLabelTest test = new SodaBottleLabelTest();
      test.testGetBrand();
      test.testGetLogo();
      test.testGetIngredient();

      System.out.println("All SodaBottleLabel tests passed");
   }
}
