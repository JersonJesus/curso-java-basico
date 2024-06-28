package com.ronin.cursojava.aula17.labs;
/*10. Faça um programa que receba dois números inteiros e gere os
números inteiros que estão no intervalo compreendido por eles.*/

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1,
			num2;
		
		System.out.print("1º valor: ");
		num1 = input.nextInt();
		
		System.out.print("2º valor: ");
		num2 = input.nextInt();
		
		System.out.println("Os valores entre " + num1 + " e " + num2 + " são: ");
		
		if(num1 < num2) {
			for (int i = num1 + 1; i < num2; i++) {
				System.out.print(i + " ");
			}
		} else {
			for (int i = num1 - 1 ; i > num2; i--) {
				System.out.print(i + " ");
			}
		
		}
		
		input.close();
		
	}

}
