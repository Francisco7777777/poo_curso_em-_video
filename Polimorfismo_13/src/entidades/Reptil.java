package entidades;

import entidades.Animal;

public class Reptil extends Animal {

    private String corEscama;

    /*
     Métodos abstratos da superclasse (Animal), sendo implementados.
     Polimorfismo de sobrescrição (@Override), permite que o mesmo método seja
     utilizado de modos diferentes.
     É utilizado em classes diferentes. 
     A assinatura dos métodos são iguais, pois a quantidade de parâmetro é 0.
    */
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo carne");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
