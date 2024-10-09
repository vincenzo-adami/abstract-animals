package org.lessons.java.abstact_animals.abstractClass;

public class Passerotto extends Animale {

  @Override
  public void verso() {
    System.out.println("Tweet!");
  }

  @Override
  public void mangia() {
    System.out.println("Semi e insetti");
  }

}