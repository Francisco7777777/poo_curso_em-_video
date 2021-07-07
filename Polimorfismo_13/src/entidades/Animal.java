/*
 * Uma árvore de herança
 * Classe definida como abstrata. Não pode gerar objetos.
 */
package entidades;

public abstract class Animal {

    protected float peso;
    protected int idade;
    protected int menbros;

    /* O métodos abstratos só podem ser utilizados pela classe, se a classe for 
     definida como uma classe abstrata. Os métodos serão implementados nas classes filhas. */
    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdde(int idade) {
        this.idade = idade;
    }

    public int getMenbross() {
        return menbros;
    }

    public void setMenbros(int menbros) {
        this.menbros = menbros;
    }

}
