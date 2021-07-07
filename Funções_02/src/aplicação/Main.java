/*
 * Funções em Java
 */
package aplicação;

public class Main {

    public static void main(String[] args) {

        somar(10, 15);      //Chamada da função (somar).

    }

    // Funções declaradas na classe principal devem ser declaradas como static.
    // Função ou uma instrução(soma).
    static void somar(int x, int y) {
        System.out.println(x + y);

    }

    static void subt(int x, int y) {
        System.out.println(y - x);

    }

}
