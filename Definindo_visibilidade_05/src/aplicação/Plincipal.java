/*
 * Definindo visibilidade.
 * Definindo métodos e atributos como (público, privado, protegido).
 */
package aplicação;

public class Plincipal {

    public static void main(String[] args) {

        Caneta C1 = new Caneta();
        C1.modelo = "Caneta";     //Atributo (modelo) foi definido como público.
        C1.cor = "Verde";
        C1.carga = 77;           //Atributo (ponta) foi definido como protegido.

        /* Por mais que o atributo (tampada) foi definido como privado, posso 
         ter acesso por meio do método (destampar) que foi definido como 
         público */
        C1.destampar();
        C1.status();
    }

}
