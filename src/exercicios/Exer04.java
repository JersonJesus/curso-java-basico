package exercicios;
/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.*/
import java.util.Scanner;

public class Exer04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in, "ISO-8859-1");
        
        int num1,
            num2,
            soma;    
        
        System.out.print("Digite um valor: ");
        num1 = input.nextInt();
        
        System.out.print("Digite outro valor: ");
        num2 = input.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + soma);
        
        input.close();
    }
}
