package lab2.phone;

import lab2.logo.IphoneLogo;
import lab2.size.IphoneSize;

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
