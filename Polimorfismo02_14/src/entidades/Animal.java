package entidades;

/*                   
 * Herança
 * Classe definida como abstrata. Não pode gerar objetos.
 */
public abstract class Animal {

    protected float peso;
    protected int idade, nMenbros;

    /* O métodos abstratos só podem ser utilizados pela classe, se a classe for 
     definida como uma classe abstrata. Os métodos serão implementados nas classes
     filhas. */
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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getnMenbros() {
        return nMenbros;
    }

    public void setnMenbros(int nMenbros) {
        this.nMenbros = nMenbros;
    }

}
