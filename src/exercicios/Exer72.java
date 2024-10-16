package exercicios;

public class Exer72 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
       vetor[0] = 5;
        
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] + vetor[0];    
        }
        for (int i : vetor) {
            System.out.print("[" + i + "] ");
        }
        System.out.println("");
    }
}
