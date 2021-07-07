/*
 * Classe filha (Aluno) herdará os atributos e métodos da classe (Pessoa).
 * A classe (Aluno) estende a classe (Pessoa), amplia os atributos e métodos da classe mão (Pessoa).
 */
package aplicação;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void cancelarM() {
        System.out.println("matricula cancelada");
    }

    public void setMatricula(int ma) {
        this.matricula = ma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setCurso(String cur) {
        this.curso = cur;
    }

    public String getCurso() {
        return curso;
    }

}
