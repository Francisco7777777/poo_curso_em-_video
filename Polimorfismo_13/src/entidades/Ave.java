package entidades;

import entidades.Animal;

public class Ave extends Animal {

    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
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
        System.out.println("voando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas e grãos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave <<<");
    }

    public void fazerNinho() {
        System.out.println("Construindo ninho.");
    }
}
