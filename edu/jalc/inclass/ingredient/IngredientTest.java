package edu.jalc.inclass.ingredient;

public class IngredientTest{

  public void testGetIngredient(){
    System.out.println("Testing Ingredient: :getIngredient");
    Ingredient ingredient = new Ingredient("Water");
    assert(ingredient.getIngredient().equals(water));
  }

  public static void main(String... args){
    IngredientTest ingredientTest = new IngredientTest();
    ingredientTest.getLogo();
    System.out.println("IngredientTest completed");
  }


}
