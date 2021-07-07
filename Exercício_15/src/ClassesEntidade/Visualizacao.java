package ClassesEntidade;


// Relação de agregação entre as classes(Video, Visualizacao e Aluno).
public class Visualizacao {

    // Atributos.
    private Aluno espectador;      // Aluno é um espectador (espectador do tipo Aluno).
    private Video filme;           // Vídeo é um filme (filme do tipo Vídeo).

    // Método construtor.
    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;

        /* Quando o espectador inicia um vídeo a variável (totAssistido) vai receber
         mais 1 atraves dos metodos assessoria e modificadores. */
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);

        /* Quando o espectador inicia um vídeo a variável (totAssistido) vai receber
         mais 1. */
        this.filme.setViws(this.filme.getViws() + 1);
    }

    // Polimorfismo de sobrecarga.
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        // Variável (total) interna.
        int total = 0;

        if (porc <= 20) {
            total = 3;
        } else if (porc <= 50) {
            total = 5;
        } else if (porc <= 80) {
            total = 8;
        } else {
            total = 10;
        }
    }

    // Métodos acessores e modificadores.
    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    // Método (toString)que utiliza o polimorfismo de sobrescrever.
    @Override
    public String toString() {
        return "Visualizacao{" + "espectador = " + espectador + "\n filme = "
                + filme + '}';
    }

}
