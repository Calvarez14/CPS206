package edu.jalc.inclasss.bottle;

public class SodaBottleTest{

  public void testGetCapacity(){

    System.out.println("Testing SodaBottle::getCapacity");
    SodaBottle sodaBottle = new SodaBottle();
    assert(sodaBottle.getCapacity() == 20.0);
  }

  public static void main(String... args){

    SodaBottleTest sodaBottleTest = new SodaBottleTest();
    sodaBottleTest.getCapacity();
    System.out.println("All SodaBottle Test passed"):
  }
}
