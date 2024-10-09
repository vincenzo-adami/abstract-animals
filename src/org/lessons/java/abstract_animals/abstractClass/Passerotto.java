package org.lessons.java.abstract_animals.abstractClass;

import org.lessons.java.abstract_animals.interfacce.AnimaleVolante;

public class Passerotto extends Animale implements AnimaleVolante {

  @Override
  public void verso() {
    System.out.println("Cip!");
  }

  @Override
  public void mangia() {
    System.out.println("Semi");
  }

  @Override
  public void vola() {
    System.out.println("Sto volando!!!");
  }
}