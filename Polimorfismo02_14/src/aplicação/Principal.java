
package aplicação;

import entidades.Cachorro;

// Polimorfismo de sobrecarga.

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();

        cachorro.reagir(true);
        cachorro.reagir("Ola");
        cachorro.reagir(5, 8.30f);

    }

}
