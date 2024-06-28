package com.ronin.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int fatorial;
		
		System.out.print("Deseja calcular o fatorial de: ");
		fatorial = input.nextInt();
		
		int resultado = 1;
		for (int i = fatorial; i >= 1; i--) {
			resultado *= i;
		}
		System.out.println(" = " + resultado);
		
		input.close();

	}

}
