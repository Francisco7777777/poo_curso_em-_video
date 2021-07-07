package aplicação;

public class Caneta {

    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    /*
     Método construtor, Assim que um objeto é instanciado, irá executar os
     comandos que estão dentro do método construtor. Pode o não exigir passagem 
     de paranmetros
     ao instanciar o objeto.
     */
    public Caneta(String m, float p, String c) {
        this.modelo = m;
        this.ponta = p;
        this.cor = c;

        /* Chamada do método (Tampar). Todos os objetos (canetas) serão tampados
         assim que criada. */
        this.tampar();
    }

    /*
     Método acessor(get), são métodos que dão acesso a determinada coisa como o atributo(modelo).
     Não permite o acesso direto ao atributo.
     Retorna o valor do atributo, nesse caso uma (String);
     */
    public String getModelo() {
        return this.modelo;
    }

    /*
     Método modificadores(set), são métodos que modificam os valores, no atributo(modelo).
     Não permite a modificação dos atributos diretamente.
     Recebe um valor (String m) por parâmetro para modificar o atrito, não precisa retornar (void).
     */
    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTanpada() {
        this.tampada = false;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampada() {
        this.setTanpada();
    }

    public void status() {
        System.out.println("\n" + "O moselo da caneta " + this.modelo);
        System.out.println("Ponta é " + this.ponta);
        System.out.println("A cor é " + this.cor);

        if (this.tampada == true) {
            System.out.println("Caneta esta tampada");
        } else {
            System.out.println("Caneta esta destampada");
        }
    }

}
