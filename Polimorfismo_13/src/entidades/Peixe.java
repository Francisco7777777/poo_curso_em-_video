
package entidades;

import entidades.Animal;

public class Peixe extends Animal {

    private String corEscama;

    public void sotarBolhas() {
        System.out.println("Sotar bolhas.");
    }

    
    /*
     Métodos abstratos da superclasse (Animal), sendo implementados.
     Polimorfismo de sobrescrição (@Override), permite que o mesmo método seja
     utilizado de modos diferentes.
     É utilizado em classes diferentes. 
     A assinatura dos métodos são iguais, pois a quantidade de parâmetro é 0.
    */
    @Override
    public void locomover() {
        System.out.println("Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Come Peixes outros menores.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som.");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
