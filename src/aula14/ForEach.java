package aula14;

import java.util.Random;

public class ForEach {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[5];
        
        Random rand = new Random();
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(11) + 1;
            
        }
        for (int i : vetor) {
            System.out.print("[" + i + "] ");
        }
    }
}
