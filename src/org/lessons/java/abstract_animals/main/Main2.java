package org.lessons.java.abstract_animals.main;

import org.lessons.java.abstract_animals.abstractClass.*;

public class Main2 {

  public static void main(String[] args) {
    Aquila aquila = new Aquila();
    Cane cane = new Cane();
    Delfino delfino = new Delfino();
    Passerotto passerotto = new Passerotto();

    GestisciAnimali.faiVolare(aquila);
    GestisciAnimali.faiNuotare(delfino);
    GestisciAnimali.faiNuotare(cane);
    GestisciAnimali.faiVolare(passerotto);
  }

}
