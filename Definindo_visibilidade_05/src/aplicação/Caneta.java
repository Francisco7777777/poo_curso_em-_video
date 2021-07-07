package aplicação;

public class Caneta {
    /* Os atributos foram definidos como público (public). A classe atual e todas as
     outras classes têm acesso ao atributo. */

    public String modelo;
    public String cor;

    /* O atributo foi definido como privado (private). Somente essa classe atual
     tem acesso ao atributo. */
    private float ponta;

    /* O atributo foi definido como protegido (protected). Somente a classe 
     atual e suas sub-classes tem acesso. */
    protected int carga;
    private boolean tampada;

    // O método foi definido como público (public).
    public void status() {
        System.out.println("Modelo da caneta " + this.modelo);
        System.out.println("Cor da caneta é " + this.cor);
        System.out.println("A ponta é " + this.ponta);
        System.out.println("A carga = " + this.carga);
        System.out.println("A caneta esta tampada " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO não pode rabiscar");
        } else {
            System.out.println("Estol rabiscando");
        }
    }

    public void tampada() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
    
}
