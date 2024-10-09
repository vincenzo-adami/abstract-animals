package org.lessons.java.abstact_animals.abstractClass;

public class Cane extends Animale {

  @Override
  public void verso() {
    System.out.println("Woof!");
  }

  @Override
  public void mangia() {
    System.out.println("Onnivoro!");
  }

}