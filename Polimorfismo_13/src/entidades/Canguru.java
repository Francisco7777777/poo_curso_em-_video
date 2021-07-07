package entidades;

import entidades.Mamifero;

public class Canguru extends Mamifero {

    public void usarBousa() {
        System.out.println("O canguru esta utilisando a bolsa");
    }

    // Sobrescrevendo o método (locomover) herdado da classe progenitora.
    @Override
    public void locomover() {
        System.out.println("Salteando");
    }
    
}
