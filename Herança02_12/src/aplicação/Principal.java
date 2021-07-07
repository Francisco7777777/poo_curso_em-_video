/*
 *  Árvore de herança.
 */
package aplicação;

public class Principal {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Bia");
        v1.setIdade(19);
        v1.setSexo("Feminino");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Luana");
        a1.setMatricula(1223);
        a1.setCurso("Informatica");
        a1.setIdade(17);
        a1.setSexo("Feminino");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(2133);
        b1.setNome("Pedro");
        b1.setBolsa(100);
        b1.setSexo("Masculino");
        b1.pagarMensalidade();
        
    }
}
