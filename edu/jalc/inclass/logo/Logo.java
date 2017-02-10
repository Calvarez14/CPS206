package edu.jalc.inclass.logo;

public class Logo{

  private final double fontSize;

  private Logo(){
    this.fontSize = 0;
  }

  public Logo(double fontSize){
    this.fontSize = fontSize;
  }

  public double getFontSize(){
    return this.fontSize;
  }
}
