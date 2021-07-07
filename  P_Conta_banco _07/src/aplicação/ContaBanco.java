package aplicação;

public class ContaBanco {

    // Atributos.
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Método construtor.
    public ContaBanco() {

        /* Utilizando os métodos especiais (get, set), mas poderia utilizar o acesso diretamente
         ao atributo. Ex.:(this.status = false;       this.Saldo = 0;) */
        this.setStatus(false);
        this.setSaldo(0);
    }

    // Métodos.
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        System.out.println("Conta aberta com sucesso !");
        if (this.getTipo() == "CC") {
            this.setSaldo(50.00f);

        } else if (this.getTipo() == "CP") {
            this.setSaldo(150.00f);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0f) {
            System.out.println("Conta não pode ser fechada. A dinheiro na conta ");
        } else if (this.getSaldo() < 0f) {
            System.out.println("Conta em debito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso !");
        }

    }

    public void depositar(float v) {
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            // Ou this.saldo = saldo + v;

            System.out.println("Deposito realisado na conta de " + this.dono);
        } else {
            System.out.println("Impossivel deposita");
        }
    }

    public void estadoAtual() {
        System.out.println("--------------------------------------------------");
        System.out.println("Conta " + this.numConta);
        System.out.println("Tipo " + this.tipo);
        System.out.println("dono " + this.dono);
        System.out.println("Saldo " + this.saldo);
        System.out.println("estado atual da conta " + this.status);
    }

    public void sacar(float sc) {

        if (this.getStatus() == true) {
            if (this.getSaldo() >= sc) {
                this.setSaldo(this.getSaldo() - sc);
                System.out.println("Saque realisado na conta " + this.dono);
            } else {
                System.out.println("Saldo imssufíciente para saque !");
            }
        } else {
            System.out.println("Impossível sacar conta fechada !");
        }
    }

    public void pagarMensal() {
        float vl = 0;
        if (this.getTipo() == "CC") {
            vl = 12.00f;

        } else if (this.getTipo() == "CP") {
            vl = 20.00f;
        }

        if (this.getStatus() == true) {

            if (this.getSaldo() > vl) {
                this.setSaldo(this.getSaldo() - vl);
                System.out.println("Mensalidade paga !");
            } else {
                System.out.println("Saldo insuficiente !");
            }
        } else {
            System.out.println("Impossível pagar !");
        }
    }

    // Métodos Acessores e Modificadores.
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
}
