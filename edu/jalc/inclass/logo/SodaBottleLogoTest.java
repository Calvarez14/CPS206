package edu.jalc.inclass.logo;

public class SodaBottleLogoTest{

  public void testGetFontSize(){
  System.out.println("Testing SodaBottleLogo: :getFontSize");
  SodaBottleLogo sodaBottleLogo = new SodaBottleLogo(15);
  assert(SodaBottleLogo.getFontSize() == 15);
}

  public static void main(String... args){
    SodaBottleLogoTest sodaBottleLogoTest = new SodaBottleLogoTest();
    SodaBottleLogoTest.getFontSize();
    System.out.println("SodaBottleLogoTest passed");
  }
}
