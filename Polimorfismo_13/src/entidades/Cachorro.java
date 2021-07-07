package entidades;

import entidades.Mamifero;

public class Cachorro extends Mamifero {

    // Sobrescrevendo o método (emitirSom) herdado da classe progenitora.
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
}
