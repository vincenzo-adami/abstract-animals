package org.lessons.java.abstact_animals.abstractClass;

public class Aquila extends Animale {

  @Override
  public void verso() {
    System.out.println("Screeech!");
  }

  @Override
  public void mangia() {
    System.out.println("Carne");
  }

}