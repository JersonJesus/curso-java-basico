package exercicios;

public class Exer73 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        vetor[0] = vetor.length - 1;
        
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[0] - i;
        }
        for (int i : vetor) {
            System.out.print("[" + i + "] ");
        }
        System.out.println("");
    }
}
