package edu.jalc.inclass.ingredient;

public class SodaBottleIngredientTest{

  public void testGetIngredient(){
    System.out.println("Testing SodaBottleIngredient: :getIngredient");
    SodaBottleIngredient sodaBottleIngredient = new SodaBottleIngredient("Water");
    assert(SodaBottleIngredient.getIngredient().equals(water));
  }

  public static void main(String... args){
    SodaBottleIngredientTest sodaBottleIngredientTest = new SodaBottleIngredientTest();
    sodaBottleIngredientTest.getLogo();
    System.out.println("SodaBottleIngredientTest completed");
  }


}
