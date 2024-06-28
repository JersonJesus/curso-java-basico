package com.ronin.cursojava.aula17.labs;
/*7. Faça um programa que leia 5 números e informe o maior número.*/

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0,
			maior = Integer.MIN_VALUE;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "º valor: ");
			num = input.nextInt();
			
			if(num > maior) {
				maior = num ;
			}
		}
		System.out.println("Maior valor: " + maior);
		
		input.close();
		

	}

}
