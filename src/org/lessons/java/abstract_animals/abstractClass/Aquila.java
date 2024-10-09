package org.lessons.java.abstract_animals.abstractClass;

import org.lessons.java.abstract_animals.interfacce.AnimaleVolante;

public class Aquila extends Animale implements AnimaleVolante {

  @Override
  public void verso() {
    System.out.println("Aaaaahhh!");
  }

  @Override
  public void mangia() {
    System.out.println("Carne");
  }

  @Override
  public void vola() {
    System.out.println("Sto volando!!!");
  }

}