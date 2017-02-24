package edu.jalc.inclass.animal;

import edu.jalc.inclass.animal.Animal;
import edu.jalc.inclass.animal.Cat;
import edu.jalc.inclass.animal.Dog;
import edu.jalc.inclass.animal.Rabbit;
import java.util.ArrayList;

public class Driver{

  public static String animalSay(Animal animal){
    return animal.getGrowl();
  }

  public static void main(String... args){
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Dog("bark", "growl", "whimper"));
    animals.add(new Cat("meow", "purr", "growl"));
    animals.add(new Rabbit("growl", "mutter", "squeal"));

    int index = 0;
    for(Animal animal : animals){
      System.out.println("Animal Sound " + animalSay(animals.get(index)));
      index++;
    }
  }
}
