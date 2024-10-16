package aula14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OrdenarArrays {

    public static void main(String[] args) {
        
        int[] vetor = new int[5];
        
         Random rand = new Random();
        
        System.out.println("Gerando o vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(11) + 1;
            System.out.print("[" + vetor[i] + "] ");
            
        } 
        
        System.out.println(""); 
        
        System.out.println("Ordenando o vetor:");
        Arrays.sort(vetor);
        
        for (int i : vetor) {
            System.out.print("[" + i +"] ");
        }
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Buscando um valor no vetor:");
        System.out.print("Que valor desja buscar?: ");
        int valor = input.nextInt();
        boolean valorencontrado = false;
        
        
        for (int i = 0; i < vetor.length; i++) {

            if (valor == vetor[i]) {
                System.out.println("Valor encontrado na posição " + i);
                valorencontrado = true;
            }
        } 
       
        if (!valorencontrado) {
            System.out.println("Valor não encontrado no vetor");
        }
        
    }
}
