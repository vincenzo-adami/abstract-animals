package org.lessons.java.abstract_animals.abstractClass;

import org.lessons.java.abstract_animals.interfacce.AnimaleNuotante;

public class Delfino extends Animale implements AnimaleNuotante {

  @Override
  public void verso() {
    System.out.println("Click-click!");
  }

  @Override
  public void mangia() {
    System.out.println("Pesce!");
  }

  @Override
  public void nuota() {
    System.out.println("Sto nuotando!!!");
  }
}