/*
 *  Classe Livro implementa a interface publicação. 
 */
package aplicação;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;     //Atributo do tipo (Pessoa).

    // Métodos construtor.
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;

        this.pagAtual = 0;
        this.aberto = false;
    }

    // Método especial (toString)
    public String detalhes() {
        return "\n Livro {" + "Titulo = " + titulo + "\n Altor = " + autor + "\n Total de paginas "
            + totPaginas + ",  pagina atual = " + pagAtual + "\n Aberto = " + aberto + "\n Leitor " + leitor.getNome() + ",  Idade : "
            + leitor.getIdade() + ",  Genero : " + leitor.getSexo() + " }";
    }

    // Métodos assessor e modificadores.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String ti) {
        this.titulo = ti;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String au) {
        this.autor = au;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int p) {
        this.totPaginas = p;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // implementação dos métodos abstratos da interface.
    public void abrir() {
        this.aberto = true;
    }

    public void fechar() {
        this.aberto = false;
    }

    public void folhear(int pag) {
        if (pag > totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = pag;
        }
    }

    public void avancarPagina() {
        this.pagAtual++;
    }

    public void voltarPagina() {
        this.pagAtual--;
    }

}
