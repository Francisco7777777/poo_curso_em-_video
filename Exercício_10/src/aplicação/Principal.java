package aplicação;

public class Principal {

    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[3];
        Livro[] li = new Livro[3];

        p[0] = new Pessoa("Ana", 20, "feminino");
        p[1] = new Pessoa("Land", 26, "masculino");
        p[2] = new Pessoa("Clara", 18, "Feminino");

        li[0] = new Livro("Aprendendo Java", "José", 300, p[0]);
        li[1] = new Livro("Programação oriemtada a objetos", "Maria", 350, p[1]);
        li[2] = new Livro("Tipos abstrados de dados", "Mateus", 500, p[2]);

        li[0].abrir();
        li[0].folhear(155);
        System.out.println(li[0].detalhes());

        System.out.println(li[1].detalhes());
        
    }
}
