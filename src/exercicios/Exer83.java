package exercicios;

import java.util.Arrays;
import java.util.Random;

/*83) [DESAFIO] Crie uma l�gica que preencha um vetor de 20 posi��es com n�meros
aleat�rios (entre 0 e 99) gerados pelo computador. Logo em seguida, mostre os
n�meros gerados e depois coloque o vetor em ordem crescente, mostrando no final
os valores ordenados.*/
public class Exer83 {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] vetor = new int[5];

        System.out.println("Gerando o vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(99);
        }
        for (int i : vetor) {
            System.out.print("[" + i + "] ");
        }

        System.out.println("");

        Arrays.sort(vetor);

        System.out.println("Ordenando o vetor: ");
        for (int i : vetor) {
            System.out.print("[" + i + "] ");
        }

    }
}
