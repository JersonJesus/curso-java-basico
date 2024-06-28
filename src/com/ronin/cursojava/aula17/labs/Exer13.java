package com.ronin.cursojava.aula17.labs;
/*14. Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.*/

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num,
			numPar = 0,
			numImpar = 0;
		
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("Digite o " + i + "º valor: ");
			num = input.nextInt();
			
			if(num % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		}
		
		System.out.println("\nNúmeros Pares: " + numPar);
		System.out.println("Números Impares: " + numImpar);
		
		input.close();

	}

}
