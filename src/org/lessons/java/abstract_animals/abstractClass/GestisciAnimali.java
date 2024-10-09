package org.lessons.java.abstract_animals.abstractClass;

import org.lessons.java.abstract_animals.interfacce.*;

public class GestisciAnimali {

  public static void faiVolare(AnimaleVolante animale) {
    animale.vola();
  };

  public static void faiNuotare(AnimaleNuotante animale) {
    animale.nuota();
  }
}
