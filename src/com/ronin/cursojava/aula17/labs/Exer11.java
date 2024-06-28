package com.ronin.cursojava.aula17.labs;
/*11. Altere o programa anterior para mostrar no final a soma dos números.*/

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1,
			num2,
			soma = 0;
		
		System.out.print("1º valor: ");
		num1 = input.nextInt();
		
		System.out.print("2º valor: ");
		num2 = input.nextInt();
		
		System.out.println("Os valores entre " + num1 + " e " + num2 + " são: ");
		
		if(num1 < num2) {
			for (int i = num1 + 1; i < num2; i++) {
				System.out.print(i + " ");
				soma += i;
			}
		} else {
			for (int i = num1 - 1 ; i > num2; i--) {
				System.out.print(i + " ");
				soma += i;
			}
		
		}
		
		System.out.println("\nA soma total dos valores do intervalo é de " + soma);
		
		input.close();
	}

}
