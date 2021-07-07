/*
 * Classe Random
 * Aplicação gera 6 numeros aleatorios de (1 a 60).
 */
package aplicação;

//Importa a classe Random.
import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        
        Random gerar = new Random();          // A função Random gera números aleatórios.           
        //Criei uma variável geral do tipo (Random), esta variável vai receber um objeto do tipo 

        for (int i = 0; i < 6; i++) {
            int numero = gerar.nextInt(60) + 1;
            /*Alocou um espaço de memória do tipo inteiro, na variável (número), 
             utilizando o método nexInt() para gerar números inteiros, no intervalo 
             de 0 até 60. Devolve um valor do tipo inteiro. */

            System.out.println(numero);
        }

    }
}
