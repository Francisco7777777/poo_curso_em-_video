/*
 * Exercício com todo conteúdo visto em POO.
 */
package aplicação;

import ClassesEntidade.Aluno;
import ClassesEntidade.Video;
import ClassesEntidade.Visualizacao;

public class Main {

    public static void main(String[] args) {
        
        Video video[] = new Video[3];
        video[0] = new Video("Aula 1 de POO");
        video[1] = new Video("Aula 5 de PHP");
        video[2] = new Video("Aula 10 de HTML5");

        Aluno pe[] = new Aluno[3];
        pe[0] = new Aluno("Bruna", 16, 'F', "@Bruna");
        pe[1] = new Aluno("Laura", 20, 'F', "@Laura");
        pe[2] = new Aluno("João", 16, 'M', "@João");

        System.out.println(video[0].toString());
        System.out.println(pe[0].toString());
        System.out.println("=================================================");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(pe[0], video[2]);
        System.out.println(video[0].toString());
        vis[1] = new Visualizacao(pe[0], video[1]);
        System.out.println(vis[1].toString());
        
    }
}
