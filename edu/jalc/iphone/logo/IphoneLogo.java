package edu.jalc.iphone.logo;

public class IphoneLogo{
   private final double width;

   private IphoneLogo(){
      this.width = 0.0;
   }

   public IphoneLogo(double width){
      this.width = width;
   }

   public double getWidth(){
      return this.width;
   }

}
