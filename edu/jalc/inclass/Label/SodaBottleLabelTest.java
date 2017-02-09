package edu.jalc.inclass.label;
public class SodaBottleLabelTest{

   public void testGetBrand(){
      System.out.println("Testing SodaBottleLabel: :getTestBrand");
      SodaBottleLabel sodaBottleLabel = new SodaBottleLabel("Fanta");
      String fanta = "Fanta";
      assert(sodaBottleLabel.getBrand().equals(fanta));
   }

   public void testGetLogo(){
    System.out.println("Testing SodaBottleLabel: :getTestLogo");
    SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(fontSize);
    assert(fontSize == sodaBottleLabel.getLogo());
   }

   public void testGetIngredient(){
     System.out.println("Testting SodaBottleLabel: :getTestIngredient");
     SodaBottleLabel sodaBottleLabel = new SodaBottleLabel(sugar);
     assert(sugar == sodaBottleLabel.getIngredient());
   }
   public static void main(String... args) throws Exception{
     SodaBottleLabelTest test = new SodaBottleLabelTest();
     test.testgetBrand();
     test.testGetLogo();
     test.testGetIngredients();

     System.out.println("All SodaBottleLabel tests passed");
   }
}
