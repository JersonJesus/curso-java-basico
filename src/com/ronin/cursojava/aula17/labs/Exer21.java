package com.ronin.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean ehPrimo = true;
		
		System.out.print("Digite o número: ");
		int num = input.nextInt();
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + " não é Primo.");
				ehPrimo = false;
			}
		}
		
		if(ehPrimo) {
			System.out.println(num + " é Primo.");
		}
		input.close();
	}

}
