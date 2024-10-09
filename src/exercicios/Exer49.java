package exercicios;

/*49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares*/
import java.util.Scanner;

public class Exer49 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num = 0,
            c = 1,
            numPares = 0,
            numImpares = 0;
        
        while (c <= 7) {            
            System.out.print("Digite o " + c + "º número: ");
            num = input.nextInt();
            
            if (num % 2 == 0) {
                numPares+=1;
            } else {
                numImpares+=1;
            }
            
            c++;
        }
        System.out.println("Números Pares Digitados: " + numPares);
        System.out.println("Números Impares Digitados: " + numImpares);
        
        input.close();
    }
}
