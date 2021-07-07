package aplicação;

public class Lutador {

    private String nome, nacionalidade;
    private String categoria;
    private int idade;
    private float peso, altura;
    private int vitorias, derrotas, empates;

    public Lutador(String no, String na, int id, float pe, float al, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {

        if (this.peso > 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Peso pena";
        } else if (this.peso <= 83.7) {
            this.categoria = "Peso medio";
        } else if (this.peso <= 120.5) {
            this.categoria = "Peso pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setVDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmates(int empates) {
        this.empates = empates;
    }

    public void apresentando() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("Apresentando o lutador !: " + this.getNome());
        System.out.println("Diretamente do " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos é " + this.getAltura() + "m de altura");
        System.out.println("Pesando " + this.getPeso() + "Kg");
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void status() {
        System.out.println("==========================================================");
        System.out.println(this.getNome() + " é um " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
        // Ou this.vitorias = this.vitorias + 1;
    }

    public void perdeLuta() {
        this.setVDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmates(getEmpates() + 1);
    }
    
}
