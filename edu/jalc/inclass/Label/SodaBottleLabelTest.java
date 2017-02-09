package edu.jalc.inclass.label;
public class SodaBottleLabelTest{

   public void testGetBrand(){
      System.out.println("Testing SodaBottleLabel: :getTestBrand");
      SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Fanta");
      //String fanta = "Fanta"
      //assert(sodaBottleLabel.getBrand().equalsIgnoreCase(fanta));
   }

   public void testGetLogo(){
    System.out.println("Testing SodaBottleLabel: :getTestLogo");
    SodaBottleLabel sodaBottleLabel = new SodaBottleLabel();
    assert( == sodaBottleLabel.getLogo());
   }

   public void testGetIngredients(){
     System.out.println("Testting SodaBottleLabel: :getTestIngredients");
     SodaBottleLabel sodaBottleLabel = new SodaBottleLabel();
     assert( == sodaBottleLabel.getIngredients());
   }
   public static void main(String... args) throws Exception{
     SodaBottleLabelTest test = new SodaBottleLabelTest();
     test.testgetBrand();
     test.testGetLogo();
     test.testGetIngredients();

     System.out.println("All SodaBottleLabel tests passed");
   }
}
