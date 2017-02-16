package edu.jalc.iphone.size;

public class IphoneSizeTest{

  public void testGetScreenSize(){
    System.out.println("Testing IphoneSize: :getScreenSize");
    IphoneSize iphoneSize = new IphoneSize(5.5);
    assert(iphoneSize.getScreenSize() == 10.5);
  }

  public static void main(String... args){
    IphoneSizeTest iphoneSizeTest = new IphoneSizeTest();
    iphoneSizeTest.testGetScreenSize();
    System.out.println("IphoneSize Test Passed");
  }
}
