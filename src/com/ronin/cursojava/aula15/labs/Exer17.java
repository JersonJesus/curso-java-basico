package com.ronin.cursojava.aula15.labs;

import java.util.Scanner;

/*17. Faça um Programa que peça um número correspondente a um
determinado ano e em seguida informe se este ano é ou não bissexto.*/

public class Exer17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o Ano: ");
		int ano = input.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 ) {
			System.out.println(ano + " é um ano Bissexto.");
		} else {
			System.out.println(ano + " não é um ano Bissexto.");
		}
		
		input.close();
	}

}
