package exercicios;

import java.util.Scanner;

/*66) Escreva um programa que leia um número qualquer e mostre a tabuada desse
número, usando a estrutura ?para?.
Ex: Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ...*/
public class Exer66 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um valor: ");
        int valor = input.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            System.out.println(valor + " + " + i + " = " + (valor * i));
        }
        
        input.close();
    }
}
