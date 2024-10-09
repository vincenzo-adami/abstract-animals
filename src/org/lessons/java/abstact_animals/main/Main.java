package org.lessons.java.abstact_animals.main;

import org.lessons.java.abstact_animals.abstractClass.Animale;
import org.lessons.java.abstact_animals.abstractClass.Aquila;
import org.lessons.java.abstact_animals.abstractClass.Cane;
import org.lessons.java.abstact_animals.abstractClass.Delfino;
import org.lessons.java.abstact_animals.abstractClass.Passerotto;

public class Main {
  public static void main(String[] args) {
    Animale aquila = new Aquila();
    Animale cane = new Cane();
    Animale delfino = new Delfino();
    Animale passerotto = new Passerotto();

    System.out.print("Il verso dell'aquila è: ");
    aquila.verso();
    System.out.print("L'aquila mangia: ");
    aquila.mangia();

    System.out.print("Il verso del cane è: ");
    cane.verso();
    System.out.print("Il cane è: ");
    cane.mangia();

    System.out.print("Il verso del delfino è: ");
    delfino.verso();
    System.out.print("Il delfino mangia: ");
    delfino.mangia();

    System.out.print("Il verso del passerotto è: ");
    passerotto.verso();
    System.out.print("Il passerotto mangia: ");
    passerotto.mangia();
  }
}
