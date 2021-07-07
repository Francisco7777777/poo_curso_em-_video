/*
 * Polimorfismo. 
 * 1_ Polimorfismo de sobreposição.
 */
package aplicação;

import entidades.Tartaruga;
import entidades.Cobra;
import entidades.Canguru;
import entidades.Cachorro;
import entidades.Peixe;
import entidades.Reptil;
import entidades.Mamifero;
import entidades.Ave;

public class Main {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setIdde(10);
        m.setPeso(2.38f);
        m.setMenbros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();

        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - ");

        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tataruga = new Tartaruga();

        canguru.locomover();
        cachorro.locomover();
        cobra.locomover();
        tataruga.locomover();

    }
}
