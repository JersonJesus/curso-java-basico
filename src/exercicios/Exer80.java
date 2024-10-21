package exercicios;

import java.util.Random;
import java.util.Scanner;

/*80) Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e
15 sorteados pelo computador. Depois disso, peça para o usuário digitar um
número (chave) e seu programa deve mostrar em que posições essa chave foi
encontrada. Mostre também quantas vezes a chave foi sorteada.*/
public class Exer80 {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Gerando o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(15) + 1;
            System.out.print(i + ":[" + vetor[i] + "] ");
        }
        System.out.println("");

        boolean foundKey = false;
        int c = 0;

        System.out.print("Digite a chave: ");
        int key = input.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == key) {
                foundKey = true;
                System.out.println("Chave encontrada na posição: " + i);
                c++;

            }
            if (foundKey == true && i == vetor.length-1) {
                System.out.println("Chave Sorteada " + c + " vezes.");
            }

        }
        if (!foundKey) {
            System.out.println("A chave não foi encontrada.");
        }
    }
}
