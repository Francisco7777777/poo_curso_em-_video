/*
 * Criando Classe com atributos e métodos.
 * Instalando o objeto.
 * Referência  ao objeto (this.).
 */
package aplicação01;

public class Pricipal {

    //Classe Main com o método principal.
    public static void main(String[] args) {

        //Criei um objeto ou instanciei um objeto(C1).
        Caneta C1 = new Caneta();            //C1 é uma variável do tipo Caneta.

        C1.modelo = "Caneta01";
        C1.cor = "Azul";
        C1.ponta = 0.7f;

        // C1 chama o método (destanpada).
        C1.destampar();
        //C1.tampada();
        C1.status();
        C1.rabiscar();

        // Criei um novo objeto(C2).
        Caneta C2 = new Caneta();
        C2.modelo = "Caneta02";
        C2.cor = "Preto";
        C2.ponta = 0.7f;
        C2.status();
        C2.tampada();
        C2.rabiscar();
        
    }
}
