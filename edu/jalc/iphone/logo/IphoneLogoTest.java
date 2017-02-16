package edu.jalc.iphone.logo;

public class IphoneLogoTest{

  public void testGetWidth(){
    System.out.println("Testing IphoneLogo: :getWidth");
    IphoneLogo iphoneLogo = new IphoneLogo(2.2);
    assert(iphonelogo.getWidth() == 2.2);
  }

  public static void main(String... args){
    IphoneLogo iphoneLogo = new IphoneLogo();
    iphonelogo.getwidth();
    System.out.println("IphoneLogo Test Passed");
  }
}
