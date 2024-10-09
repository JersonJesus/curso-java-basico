package exercicios;

import java.util.Scanner;

/*56) Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado*/
public class Exer56 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num;
        
        while (true) {            
            System.out.print("Digite um valor: ");
            num = input.nextInt();
            
            if (num == 1111) {
                break;
            }
        }
        System.out.println("PROGRAMA ENCERRADO");
        
    }
}
