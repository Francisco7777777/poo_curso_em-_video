/*
 * Relacionamento entre Classes.
 * Relacionamento de agregação.
 */
package aplicação;

public class Principal {

    public static void main(String[] args) {

        // Instanciei um vetor (l) de 6 posições do tipo (Lutador).
        Lutador l[] = new Lutador[6];

        // Para cada elemento do vetor cria-se um novo objeto (Lutador);
        l[0] = new Lutador("Geison Silva", "Brasil", 21, 61.0f, 1.68f, 5, 2, 3);
        l[1] = new Lutador("João", "Argentina", 24, 84.0f, 1.80f, 5, 1, 4);
        l[2] = new Lutador("Artu", "Reino Unido", 25, 90.5f, 1.70f, 4, 3, 1);
        l[3] = new Lutador("Victor", "Russia", 22, 72.1f, 1.70f, 4, 2, 4);
        l[4] = new Lutador("Abert", "França", 25, 70.8f, 1.68f, 2, 4, 5);
        l[5] = new Lutador("Maicon", "Estados Unidos", 23, 78.1f, 1.69f, 3, 2, 4);

        // Criei um objeto (lut) do tipo (Luta).
        Luta lut = new Luta();
        lut.marcaLuta(l[0], l[1]);
        lut.luta();
        l[0].status();
        l[1].status();

    }
}
