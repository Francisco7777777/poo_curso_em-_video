
package ClassesEntidade;

/*
 * Herança, superclasse (Pessoa) ou classe mãe, definida como abstrata.
 * Classe abstrata não pode gerar objetos.
 * É utilizada como base para criar outras classes.
 */
public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected char sexo;
    protected float esperiencia;

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.esperiencia = 0;
    }

    protected void ganharExp() {
        this.esperiencia++;
    }

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getEsperiencia() {
        return esperiencia;
    }

    public void setEsperiencia(float esperiencia) {
        this.esperiencia = esperiencia;
    }

    @Override
    public String toString() {
        return "Pessoa {" + "nome : " + nome + ", idade = " + idade
                + ", sexo : " + sexo + ", esperiencia = " + esperiencia + '}';
    }

}
