package entidades;

import entidades.Reptil;

public class Tartaruga extends Reptil {

    // Sobrescrevendo o método (locomover) herdado da classe  progenitora.
    @Override
    public void locomover() {
        System.out.println("Andando de vagar");
    }

}
