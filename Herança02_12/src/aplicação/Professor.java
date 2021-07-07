package aplicação;

/*
 ------------ Folha -----------------
 Sub-classe (Professor) filha da superclasse (pessoa).
 Todas as subclasses herdam os métodos e atributos da superclasse. 

 A classe Professor estende a classe (pessoa).
 Classe definida como final não pode ter classes filhas.
 */
public final class Professor extends Pessoa {

    private String especialidade;
    private int salario;

    public void resAumento(int au) {
        this.salario = this.salario + au;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }
    
}
