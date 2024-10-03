package exercicios;
/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10*/
import java.util.Scanner;

public class Exer06 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in, "ISO-8859-1");
        
        int num,
            antecessor,
            sucessor;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        antecessor = num - 1;
        sucessor = num + 1;
        
        System.out.println("O antecessor de " + num + " é " + antecessor);
        System.out.println("O sucessor de " + num + " é " + sucessor);
                
        
        input.close();
    }
}
