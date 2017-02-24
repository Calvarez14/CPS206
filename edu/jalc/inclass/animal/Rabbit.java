package edu.jalc.inclass.animal;

public class Rabbit extends Animal{

  String mutter;
  String squeal;

  private Rabbit(){
    super(null);
  }

  public Rabbit(String growl, String mutter, String squeal){
    super(growl);
    this.mutter = mutter;
    this.squeal = squeal;
  }
}
