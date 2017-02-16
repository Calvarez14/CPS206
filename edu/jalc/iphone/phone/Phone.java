package edu.jalc.iphone.phone;

import edu.jalc.iphone.logo.IphoneLogo;
import edu.jalc.iphone.size.IphoneSize;

public class Phone{

  private String brand;
  private IphoneLogo logo;
  private IphoneSize size;

  private Phone(){
    this.brand = null;
    this.logo = null;
    this.size = null;
  }

  public Phone(String brand){
    this.brand = brand;
    this.logo = logo;
    this.size = size;
  }

  public String getBrand(){
    return brand;
  }

  public IphoneLogo getLogo(){
    return logo;
  }

  public IphoneSize getSize(){
    return size;
  }
}
