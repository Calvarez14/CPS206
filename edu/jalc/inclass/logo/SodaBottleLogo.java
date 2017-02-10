package edu.jalc.inclass.logo;

public class SodaBottleLogo{

  private final double fontSize;

  private SodaBottleLogo(){
    this.fontSize = 0;
  }

  public SodaBottleLogo(double fontSize){
    this.fontSize = fontSize;
  }

  public double getFontSize(){
    return this.fontSize
  }
}
