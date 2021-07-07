package aplicação;

/*
 ------------ Folha -----------------
 Subclasse (Bolsista) filha da super classe (Aluno) que por sua vez é filha da classe (Pessoa).
 Todas as subclasses herdam os métodos e atributos da superclasse. 

 Classe Bolsista extende a classe (Aluno). A classe (Aluno) estende a classe (pessoa).
 */
public class Bolsista extends Aluno {

    private int bolsa;

    public void renovarBolsa() {
        /*
         O método (nome) só pode ser utilizado pois na classe pessoa a viabilidade esta como
         protegido.
        */
        System.out.println("Bolsa renovada do aluno " + this.nome);
    }

    // Utilizando a sobreposição (@override).
    @Override
    public void pagarMensalidade() {
        System.out.println("\nO(a) " + this.nome + " É bolsista ! Mensalidade facilitada.");
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
