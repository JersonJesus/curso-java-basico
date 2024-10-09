package exercicios;
/*48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles.*/

import java.util.Scanner;

public class Exer48 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num = 0,
            soma = 0,
            c = 1;
        
        while (c <= 7) {            
            System.out.print("Digite o " + c + "º número: ");
            num = input.nextInt();
            
            soma+= num;
            
            c++;
        }
        System.out.println("Soma Total: " + soma);
        
        input.close();
        
    }
}
