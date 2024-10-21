package exercicios;

import java.util.Random;

/*78) Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
mostre o vetor inteiro na tela e em seguida mostre em que posições foram
digitados valores que são múltiplos de 10.*/
public class Exer78 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int[] vetor = new int[15];
        
        System.out.println("Gerando o vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100)+1;
            System.out.print(i+":["+vetor[i]+"] ");
        }
        System.out.println("");
        
        System.out.println("Posição dos valores que são múltiplos de 10: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 10 == 0) {
                System.out.print(i + " ");
            }     
        }
        System.out.println("");
    }
}
