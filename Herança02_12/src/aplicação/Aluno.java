package aplicação;

/*
 ------------ Progenitora -----------------
 Subclasse (Aluno) filha da superclasse (Pessoa).
 Todas as subclasses herdam os métodos e atributos da superclasse. 

 A classe Aluno estende a classe (pessoa).
 */
public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("\nMensalidade do aluno(a) " + this.nome + " paga.");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
