package org.lessons.java.abstract_animals.abstractClass;

import org.lessons.java.abstract_animals.interfacce.AnimaleNuotante;

public class Cane extends Animale implements AnimaleNuotante {

  @Override
  public void verso() {
    System.out.println("Bau!");
  }

  @Override
  public void mangia() {
    System.out.println("Onnivoro!");
  }

  @Override
  public void nuota() {
    System.out.println("Sto nuotando!!!");
  }
}