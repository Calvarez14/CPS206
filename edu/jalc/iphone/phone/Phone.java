package edu.jalc.iphone.phone;

import edu.jalc.iphone.logo.IphoneLogo;
import edu.jalc.iphone.size.IphoneSize;

public class Phone{

  private String brand;
  private Logo logo;
  private Size size;

  private Phone(){
    this.brand = null;
    this.logo = null;
    this.size = 0.0;
  }

  public Phone(String brand){
    this.brand = brand;
    this.logo = logo;
    this.size = size;
  }

  public String getBrand(){
    return brand;
  }

  public Logo getlogo(){
    return logo;
  }

  public Size getSize(){
    return size;
  }
}
