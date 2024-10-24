package exercicios;

import java.util.Scanner;

/*91) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Maior() que vai verificar qual deles é o maior e
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
informando essa característica.*/
public class Exer91 {
    static void maior(int n1, int n2){
        int maior;
        
        if (n1 > n2) {
            maior = n1;
            System.out.println("O maior número é " + maior);
        } else if(n2 > n1){
            maior = n2;
            System.out.println("O maior número é " + maior);
        } else {
            System.out.println(n1 + " e " + n2 + " são iguais.");
        }
        
        
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o 1º número: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o 2º número: ");
        int num2 = input.nextInt();
        
        maior(num1, num2);
        
    }
}
