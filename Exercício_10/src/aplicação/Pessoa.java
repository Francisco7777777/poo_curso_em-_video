package aplicação;

public class Pessoa {

    // Atributos.
    private String nome;
    private int idade;
    private String sexo;

    // Métodos construtor.
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void faserAniversario() {
        this.idade++;    // Será acrescentado + 1.
    }

    // Métodos assessor e modificadores.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
