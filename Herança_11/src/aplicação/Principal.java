/*
 * Herança um dos pilares da P.O.O.
 */
package aplicação;

public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");        // Objeto do tipo Aluno utilizando um método herdado da classe mãe.
        p3.setNome("Paulo");
        p4.setNome("Luana");

        p1.setIdade(18);
        p2.setIdade(20);
        p3.setIdade(23);
        p4.setIdade(25);

        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");

        p2.setCurso("Programação orientada a objeto");
        p3.setSalario(2800);
        p4.setSetor("Administrativo");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }

}
