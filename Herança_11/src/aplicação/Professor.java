/*
 * Classe filha (Professor) herdará os atributos e métodos da classe (Pessoa).
 * A classe (Professor) estende a classe (Pessoa), amplia os atributos e métodos da classe mão (Pessoa).
 */
package aplicação;

public class Professor extends Pessoa {

    private String especialidade;
    private int salario;

    public void receberAum(int au) {
        this.salario += au;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String esp) {
        this.especialidade = esp;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int sa) {
        this.salario = sa;
    }
    
}
