package exercicios;

import java.util.Scanner;

/*69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma
PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
a soma entre todos os valores da sequência.*/

public class Exer69 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1º Termo: ");
        int primeiroTermo = input.nextInt();
        
        System.out.print("Razão: ");
        int razao = input.nextInt();
        
        int termoSeguinte = 0;
        
        System.out.print("PA: ");
        for (int i = 1; i <= 10; i++) {
            
            termoSeguinte = primeiroTermo + (i - 1) * razao;
            System.out.print(termoSeguinte + " ");
        }
    }
}
