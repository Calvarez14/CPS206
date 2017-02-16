package edu.jalc.iphone.phone;

import edu.jalc.iphone.logo.IphoneLogo;
import edu.jalc.iphone.size.IphoneSize;

public class PhoneTest{

  public void testGetBrand(){
    System.out.println("Testing Phone getBrand");
    Phone phone = new Phone("Iphone");
    assert(phone.getBrand().equals("Iphoe"));
  }

  public static void main(String... args){
    PhoneTest phoneTest = new PhoneTest();
    phoneTest.testGetBrand();
    System.out.println("Test Completed");
  }
}
