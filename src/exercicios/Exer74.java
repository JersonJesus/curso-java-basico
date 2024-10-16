package exercicios;

public class Exer74 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        
	
        
        for (int i = 0; i < vetor.length; i+=2) {
           vetor[i] = 5; 
           vetor[i+1] = 3;
        }
        
        for (int i : vetor) {
            System.out.print("[" + i + "] ");
        }     
    }
}
