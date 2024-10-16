package aula14;

import java.util.Random;
import java.util.Scanner;

public class Vetores {
    
    public static void main(String[] args) {
        
        int[] vetorA = new int[5];//O nº indica o o números de posições do vetor
        System.out.println("Atribuindo inicializando os vetores: ");
        
        Random rand = new Random();
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(10)+1;
            System.out.print(vetorA[i] + " ");
        }
        
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor da " + (i+1) + "ª Posição: ");
            vetorA[i] = input.nextInt();
        }
        for (int i : vetorA) {
            System.out.print("[" + i + "]");
        }
    }
}
