package edu.jalc.inclass.label;

import edu.jalc.inclass.logo;
import edu.jalc.inclass.ingredient;

public class SodaBottleLabelTest{

   public void testGetBrand(){
      System.out.println("Testing SodaBottleLabel: :getTestBrand");
      SodaBottleLogo sodaBottleLogo = new SodaBottleLogo(15);
      SodaBottleIngredient sodaBottleIngredient = new SodaBottleIngredient("Water");
      SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Fanta",sodaBottleLogo,sodaBottleIngredient);
      String fanta = "Fanta";
      assert(sodaBottleLabel.getBrand().equals(fanta));
   }

   public void testGetLogo(){
     System.out.println("Testing SodaBottleLabel: :getTestLogo");
     SodaBottleLogo sodaBottleLogo = new SodaBottleLogo(15);
     SodaBottleIngredient sodaBottleIngredient = new SodaBottleIngredient("Water");
     SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Fanta",sodaBottleLogo,sodaBottleIngredient);
     assert(SodaBottleLogo.equals(sodaBottleLabel.getSodaBottleLogo()));
   }

   public void testGetIngredient(){
      System.out.println("Testting SodaBottleLabel: :getTestIngredient");
      SodaBottleLogo sodaBottleLogo = new SodaBottleLogo(15);
      SodaBottleIngredient sodaBottleIngredient = new SodaBottleIngredient("Water");
      SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Fanta",sodaBottleLogo,sodaBottleIngredient);
      assert(sodaBottleIngredient.equals(sodaBottleLabel.getSodaBottleIngredient())));
   }
   public static void main(String... args) throws Exception{
      SodaBottleLabelTest test = new SodaBottleLabelTest();
      test.testgetBrand();
      test.testGetLogo();
      test.testGetIngredients();

      System.out.println("All SodaBottleLabel tests passed");
   }
}
