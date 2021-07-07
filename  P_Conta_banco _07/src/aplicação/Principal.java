package aplicação;

public class Principal {

    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Artu");
        p1.abrirConta("CC");
        p1.depositar(100.00f);

        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(112);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        p2.depositar(500.00f);
        p2.sacar(100.00f);

        p2.estadoAtual();

    }
}
