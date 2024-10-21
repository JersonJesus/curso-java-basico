package exercicios;

import java.util.Random;

/*Desenvolva um programa que leia 10 n�meros inteiros e guarde-os em um vetor.
No final, mostre quais s�o os n�meros pares que foram digitados e em que
posi��es eles est�o armazenados.*/
public class Exer79 {
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        int[] vetor = new int[10];
        
        System.out.println("Gerando o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100)+1;
            System.out.print(i+":["+vetor[i]+"] ");
        }
        System.out.println("");
        
        
        System.out.println("Posi��o dos valores que s�o pares: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(i + ":[" + vetor[i] + "] ");
            }     
        }
        System.out.println("");
    }
}
