package aplicação;

public interface Publicacao {

    // Métodos abstratos.
    public abstract void abrir();

    public abstract void fechar();

    public abstract void folhear(int pag);

    public abstract void avancarPagina();

    public abstract void voltarPagina();
    
}
