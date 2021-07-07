package aplicação;

// Importa a classe (Random) que está dentro do pacote (java util).
import java.util.Random;

public class Luta {

    /*
     Tipos de dados abstratos (Lutador).
     (desafiado e desafiante) vai ser instância da classe (Lutador), vai ser um objeto
     de (Lutador).
     */
    private Lutador desafiante;
    private Lutador desafiado;

    // Tipos primitivos (int) ou variáveis primitivas.
    private int rounds;
    private boolean aprovada;

    //l1, l2 são lutadores ou objetos da classe (Lutador);
    public void marcaLuta(Lutador l1, Lutador l2) {

        // Utilizando métodos da outra classe.
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
            /* Caso a IDE reclame utilize (.equals()) que significa "é igual a", no lugar de (==). */

            this.setAprovada(true);
            this.setDesafiante(l2);
            this.setDesafiado(l1);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void luta() {
        if (this.aprovada) {
            System.out.println("================= DESAFIADO ==================");
            this.desafiado.apresentando();
            System.out.println("================= DESAFIANTE ==================");
            this.desafiante.apresentando();

            /* Criei um objeto da classe (Random), que foi importado. Para gerar os resultados. */
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);       // 0 1 2

            switch (vencedor) {
                case 0:
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perdeLuta();
                    break;

                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perdeLuta();
                    break;
            }

        } else {
            System.out.println("A luta não pode acomtecer !!");
        }
    }

    // Recebe valor do tipo abstrato (Lutador desafiado).
    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    // Retorna um valor do tipo abstrato (Lutador desafiante).
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setRounds(int r) {
        this.rounds = r;
    }

    public int getRounds() {
        return rounds;
    }

    public void setAprovada(boolean a) {
        this.aprovada = a;
    }

    public boolean getAprovado() {
        return aprovada;
    }
    
}
