/*
 * Classe mãe (Pessoa).
 * Atributos e métodos da classe mãe, serão herdados pelas filhas.
 */
package aplicação;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniv() {
        this.idade++;
    }

    // Método especial (toString).
    public String toString() {
        return "Pessoa { " + "Nome : " + nome + " Idade = " + idade + " Seso = " + sexo + " }";
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
