package entidades;

import entidades.Animal;

public class Mamifero extends Animal {

    private String corPele;

    /*
     Métodos abstratos da superclasse (Animal), sendo implementados.
     Polimorfismo de sobrescrição (@Override), permite que o mesmo método seja
     utilizado de modos diferentes.
     É utilizado em classes diferentes. 
     A assinatura dos métodos são iguais, pois a quantidade de parâmetro é 0.
    */
    @Override
    public void locomover() {
        System.out.println("Corendo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamar");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero <<<");
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
}
