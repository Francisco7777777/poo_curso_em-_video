package ClassesEntidade;

// Herança, subclasse (Aluno), ou classe filha.
public class Aluno extends Pessoa {

    private String login;
    private int totAssistido;

    // Método construtor.
    public Aluno(String nome, int idade, char sexo, String log) {

        // (super) chama os dados da superclasse (Pessoa);
        super(nome, idade, sexo);
        this.login = log;
        this.totAssistido = 0;
    }

    // Métodos assessor e modificadores.
    public void ViuMaisUm() {
        this.totAssistido++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {

        // O (super) chamará os dados da superclasse (Pessoa). 
        return "Aluno { " + super.toString() + "\n login : " + login + ", "
                + "totAssistido = " + totAssistido + '}';
    }

}
