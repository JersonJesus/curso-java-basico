package exercicios;

import java.util.Scanner;

/*95) Refaça o exercício 90, só que agora em forma de função Somador(), que vai
receber dois parâmetros e vai retornar o resultado da soma entre eles para o
programa principal.*/

public class Exer95 {
    static int somador(int n1, int n2){
        int soma = n1 + n2;
        
        return soma;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o 1º número: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o 2º número: ");
        int num2 = input.nextInt();
        
        int resultado = somador(num1, num2);
        
        System.out.println(num1 + " + " + num2 + " = " + resultado);
        
        
        
    }
}
