package edu.jalc.inclass.logo;

public class LogoTest{

  public void testGetFontSize(){
  System.out.println("Testing Logo: :getFontSize");
  Logo logo = new Logo(15);
  assert(logo.getFontSize() == 15);
}

  public static void main(String... args){
    LogoTest logoTest = new LogoTest();
    logoTest.getFontSize();
    System.out.println("LogoTest passed");
  }
}
