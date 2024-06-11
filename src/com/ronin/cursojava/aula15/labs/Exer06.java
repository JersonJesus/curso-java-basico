package com.ronin.cursojava.aula15.labs;
/*6. Faça um Programa que leia três números e mostre o maior deles.*/

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o 1º valor: ");
		int num1 = input.nextInt();
		
		System.out.print("Digite o 2º valor: ");
		int num2 = input.nextInt();
		
		System.out.print("Digite o 3º valor: ");
		int num3 = input.nextInt();
		
		int maior;
		
		if(num1 > num2 && num1 > num3) {
			maior = num1;
		} else if(num2 > num1 && num2 > num3) {
			maior = num2;
		} else {
			maior = num3;
		}
		
		System.out.println("Maior valor digitado é " + maior);
		
		input.close();
	}

}
