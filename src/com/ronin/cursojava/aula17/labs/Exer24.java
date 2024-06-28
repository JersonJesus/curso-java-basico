package com.ronin.cursojava.aula17.labs;
/*24. Faça um programa que calcule o mostre a média aritmética de N
notas.*/

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nota,
			soma = 0;
		double media;
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.print("Digite " + i + "º a nota: ");
			nota = input.nextInt();
			
			soma += nota; 
			
		}
		media = soma / 3;
		
		System.out.println("Média: " + media);
		
		input.close();

	}

}
