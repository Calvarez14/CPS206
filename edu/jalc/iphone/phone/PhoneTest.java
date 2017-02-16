package edu.jalc.iphone.phone;

import edu.jalc.iphone.logo.IphoneLogo;
import edu.jalc.iphone.size.IphoneSize;

public class PhoneTest{

  public void testGetBrand(){
    System.out.println("Testing Phone getBrand");
    Phone phone = new Phone("Iphone");
    assert(phone.getBrand().equals("Iphone"));
  }

  public static void main(String... args){
    Phone phone = new Phone();
    phone.testGetBrand();
    System.out.println("Test Completed");
  }
}
