package aplicação01;

/* Uma classe a grosso modo é como se fosse um modelo ou classificação, de um 
 objeto (caneta). */
public class Caneta {

    //Os Atributos.
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //Os métodos.
    void status() {
        // (this) é uma referência ao objeto.
        System.out.println("Modelo da caneta " + this.modelo);
        System.out.println("Cor da caneta é " + this.cor);
        System.out.println("A ponta é " + this.ponta);
        System.out.println("A carga = " + this.carga);
        System.out.println("A caneta esta tampada " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO não pode rabiscar");
        } else {
            System.out.println("Estol rabiscando");
        }
    }

    void tampada() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
