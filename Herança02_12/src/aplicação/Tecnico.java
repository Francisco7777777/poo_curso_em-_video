package aplicação;

/*
 ------------ Folha -----------------
 Subclasse (Tecnico) filha da super classe (Aluno) que por sua vez é filha da classe (Pessoa).
 Todas as subclasses herdam os métodos e atributos da superclasse. 

 A Classe Tecnico estende a classe (Aluno). A classe (Aluno) estende a classe (pessoa).
 */
public class Tecnico extends Aluno {

    private int regProficional;

    // O método definido como final não pode ser subscrito pelas suas subclasses.
    public final void Praticar() {
        System.out.println("O tecnico " + this.nome + " esta praticando.");
    }

    public int getRegProficional() {
        return regProficional;
    }

    public void setRegProficional(int rp) {
        this.regProficional = rp;
    }

}
