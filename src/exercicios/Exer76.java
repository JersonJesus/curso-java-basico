package exercicios;

import java.util.Random;

/*76) Crie um programa que preencha automaticamente um vetor num�rico com 7
n�meros gerados aleatoriamente pelo computador e depois mostre os valores
gerados na tela.*/

public class Exer76 {
    
    public static void main(String[] args) {
    
        Random rand = new Random();
        
        int[] vetor = new int[7];
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1;
            
        }
        for (int i : vetor) {
            System.out.print("[" + i + "] ");
        }
        
        
    }
}
