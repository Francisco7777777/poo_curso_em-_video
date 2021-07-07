/*
 * Interface
 * Uma interface só possui métodos.
 */
package aplicação;

public interface Controlador {

    /* Métodos abstratos.
     Os métodos abstratos serão implementados na classe, que implementa a interface. */
    public abstract void ligar();

    public abstract void desligar();

    public abstract void abrirMenu();

    public abstract void fecharMenu();

    public abstract void maisVolume();

    public abstract void menosVolume();

    public abstract void ligarMudo();

    public abstract void desligarMudo();

    public abstract void pley();

    public abstract void palse();

}
