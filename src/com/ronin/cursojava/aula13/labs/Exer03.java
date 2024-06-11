package com.ronin.cursojava.aula13.labs;

import java.util.Scanner;

/*3. Faça um Programa que peça dois números e imprima a soma.*/
public class Exer03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1,
			num2,
			resultado;
		
		System.out.print("Digite o 1º valor: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o 2º valor: ");
		num2 = input.nextInt();
		
		resultado = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + resultado);
		
	}

}
