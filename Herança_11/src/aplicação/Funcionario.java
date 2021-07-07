/*
 * Classe filha (Funcionario) herdará os atributos e métodos da classe (Pessoa).
 * A classe (Funcionario) estende a classe (Pessoa), amplia os atributos e métodos da classe mão (Pessoa).
 */
package aplicação ;

public class Funcionario extends Pessoa {

    private String setor;
    private String trabalha;

    public void mudarTrab(String mt) {
        this.trabalha = mt;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String se) {
        this.setor = se;
    }

    public String getTrabalha() {
        return trabalha;
    }

    public void setTrabalha(String tra) {
        this.trabalha = tra;
    }
    
}
