package com.ronin.cursojava.aula17.labs;
/* Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem*/

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int base,
			exp,
			resultado;
		
		System.out.print("Base: ");
		base = input.nextInt();
		
		System.out.print("Expoente: ");
		exp = input.nextInt();
		
		resultado = 1;
		
		for (int i = 1; i <= exp; i++) {
			resultado *= base;
		}
		
		System.out.println("Resultado = " + resultado);
		
		input.close();
	}

}
