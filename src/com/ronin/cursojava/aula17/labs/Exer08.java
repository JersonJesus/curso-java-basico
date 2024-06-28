package com.ronin.cursojava.aula17.labs;
/*8. Faça um programa que leia 5 números e informe a soma e a média
dos números.*/

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int soma = 0,
			num;
		double	media = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "º valor: ");
			num = input.nextInt();
			
			soma += num;
	
		}
		media = soma / 5;
		
		System.out.println("Soma total: " + soma);
		System.out.println("Média total: " + media);
		
		input.close();
	}

}
