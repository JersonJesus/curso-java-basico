package exercicios;
/*20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.*/
import java.util.Scanner;

public class Exer20 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num;
        
        System.out.print("Digte um número: ");
        num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " é Par");
        } else {
            System.out.println(num + " é Ímpar");
        }
        
        input.close();
    }
}
