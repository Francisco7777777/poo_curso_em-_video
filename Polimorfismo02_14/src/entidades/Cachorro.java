package entidades;

public class Cachorro extends Lobo {

    /*
     Polimorfismo de sobrescrição (@Override), permite que o mesmo método seja
     utilizado de modos diferentes.
     É utilizado em classes diferentes. 
     A assinatura dos métodos são iguais, pois a quantidade de parâmetro é 0.
    */
    @Override
    public void emitirSom() {
        System.out.println("Latir");
    }

    
    /*
     Polimorfismo de sobrecarga.
     Polimorfismo de sobrecarga, permite que o mesmo método seja utilizado 
     de modos diferentes.
     É utilizado na mesma classe. 
     A assinatura dos métodos são diferentes, pois a quantidade e o tipo de parâmetro 
     são diferentes.
     Não pode ter repetição de assinatura.
    */
    public void reagir(String frase) {

        /* Frase é um objeto da classe (String), então é melhor utilizar (equals)
         para comparar. */
        if (frase.equals("Toma a comida") || frase.equals("Ola")) {
            System.out.println("Rosnar");
        } else {
            System.out.println("Abanar o rabo ou latir.");
        }
    }

    public void reagir(int hora, int minuto) {

        if (hora < 12) {
            System.out.println("Abanar o rabo");
        } else if (hora <= 18) {
            System.out.println("Latir.");
        } else {
            System.out.println("Abanar e latir.");
        }
    }

    public void reagir(boolean dono) {

        if (dono == true) {
            System.out.println("Abanar o rabo.");
        } else {
            System.out.println("Latir e rosnar.");
        }
    }

    public void reagir(int idade, float peso) {

        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar o rabo e pular.");
            } else {
                System.out.println("Olhar para o dono.");
            }
        } else {
            if (peso < 10) {
                System.out.println("Latir");
            } else {
                System.out.println("ingnorar o dono");
            }
        }
    }

}
