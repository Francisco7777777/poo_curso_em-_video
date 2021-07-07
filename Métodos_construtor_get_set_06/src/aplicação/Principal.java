/*
 * Método construtor.
 * Método acessor (get).
 * Método modificador (set).
 */
package aplicação;

public class Principal {

    public static void main(String[] args) {

        Caneta canetaVerde = new Caneta("Folha", 0.7f, "Verde");
        //canetaVerde.setModelo("Folha");
        //canetaVerde.setPonta(0.7f);
        canetaVerde.status();

        Caneta Canet02 = new Caneta("Lapiseira", 0.5f, "Azul");
        Canet02.destampada();
        Canet02.status();

    }
}
