package exercicios;

import java.util.Scanner;

/*90) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Somador() que vai calcular e mostrar a soma entre
eles.*/
public class Exer90 {
    static void somador(int n1, int n2){
        int soma = n1 + n2;
        
        System.out.println(n1 + " + " + n2 + " = " + soma);
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o 1� n�mero: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o 2� n�mero: ");
        int num2 = input.nextInt();
        
        somador(num1, num2);
    }
}
