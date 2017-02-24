package edu.jalc.inclass.animal;

import edu.jalc.inclass.animal.Animal;
import edu.jalc.inclass.animal.Cat;
import edu.jalc.inclass.animal.Dog;
import edu.jalc.inclass.animal.Rabbit;
import java.util.ArrayList;

public class Driver{

  public static void animalSay(Animal animal){
    System.out.println(animal);
  }

  public static void main(String... args){
    ArrayList<Animal> animals = new ArrayList<>();
    animals.add(new Dog("bark", "growl", "whimper"));
    animals.add(new Cat("meow", "purr", "growl"));
    animals.add(new Rabbit("growl", "mutter", "squeal"));


    for(Animal animal : animals){
     animalSay(animal);
    }
  }
}
