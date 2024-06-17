package com.ronin.cursojava.aula15.labs;
/*18. Faça um Programa que peça um valor e
determine se ele é par ou impar.*/

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		int valor = input.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println(valor + " é um número par.");
		} else {
			System.out.println(valor + " é um número impar.");
		}
		
		input.close();

	}

}
