package exercicios;
/*71) Fa�a um programa que preencha automaticamente um vetor num�rico com 8
posi��es com o valor 9999*/
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
