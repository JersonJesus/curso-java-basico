package exercicios;

import java.util.Scanner;

/*95) Refa�a o exerc�cio 90, s� que agora em forma de fun��o Somador(), que vai
receber dois par�metros e vai retornar o resultado da soma entre eles para o
programa principal.*/

public class Exer95 {
    static int somador(int n1, int n2){
        int soma = n1 + n2;
        
        return soma;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o 1� n�mero: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o 2� n�mero: ");
        int num2 = input.nextInt();
        
        int resultado = somador(num1, num2);
        
        System.out.println(num1 + " + " + num2 + " = " + resultado);
        
        
        
    }
}
