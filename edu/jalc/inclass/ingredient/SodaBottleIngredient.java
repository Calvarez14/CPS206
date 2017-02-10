package edu.jalc.inclass.ingredient;

public class SodaBottleIngredient{

  private final String ingredient;
  private final ArrayList<String> arrayList;

  private SodaBottleIngredient(){
    this.ingredient = null;
  }

  public SodaBottleIngredient(String ingredient){
    this.arrayList = new ArrayList<>();
    this.arrayList.push(ingredient);
  }

  public String getIngredient(){
    return this.ingredient;
  }
}
