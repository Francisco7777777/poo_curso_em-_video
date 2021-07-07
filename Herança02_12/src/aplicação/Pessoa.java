package aplicação;

/* 
 ------------- Raiz ----------------
 Classe Pessoa (Mãe, Progenitora).
 Atributos e métodos da classe mãe, serão herdados pelas suas sub-classes (filhas e descendentes).
  
 Pode ser uma Classe abstrata (abstract).
 Uma classe abstrata não pode ser implementada, só pode servir como progenitora (mãe).
 Uma classe abstrata não pode gerar objeto.
 */
public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected String sexo;

    public void fazerAniv() {
        this.idade++;             // Recebe + 1.
    }

    // Método especial (toString).
    public String toString() {
        return "\nPessoa { " + "Nome : " + nome + " Idade = " + idade + " Sexo = " + sexo + " }";
    }

    // Métodos assessor e modificadores.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

}
