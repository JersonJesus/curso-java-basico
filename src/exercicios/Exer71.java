package exercicios;
/*71) Faça um programa que preencha automaticamente um vetor numérico com 8
posições com o valor 9999*/
import java.util.Arrays;

public class Exer71 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[8];
        
        Arrays.fill(vetor, 999);
        
        for (int i : vetor) {
            System.out.print("[" + i + "] ");
        }
        System.out.println("");
    }
}
