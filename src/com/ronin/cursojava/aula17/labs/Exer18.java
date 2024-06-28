package com.ronin.cursojava.aula17.labs;
/*18. Faça um programa que, dado um conjunto de N números, determine o
menor valor, o maior valor e a soma dos valores.*/

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0,
			soma = 0,
			maior = Integer.MIN_VALUE,
			menor = Integer.MAX_VALUE;
			
			for (int i = 1; i <= 5; i++) {
				System.out.print("Digite o " + i + "º valor: ");
				num = input.nextInt();
				
				soma+=num;
				
				if(num > maior) {
					maior = num ;
				}
				if(num < menor) {
					menor = num ;
				}
			}
			System.out.println("Maior valor: " + maior);
			System.out.println("Menor valor: " + menor);
			System.out.println("Soma dos valores digitados = " + soma);
			
			input.close();
			

	}

}
