/*
 * Um dos pilares da P.O.O o (Encapsulamento), com interface.
 */
package aplicação;

public class Principal {

    public static void main(String[] args) {

        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.pley();
        c.abrirMenu();
        c.fecharMenu();

    }
}
