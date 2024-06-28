package com.ronin.cursojava.aula17.labs;
/*22. Altere o programa de cálculo dos números primos, informando, caso o
número não seja primo, por quais número ele é divisível.*/

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean ehPrimo = true;
		
		System.out.print("Digite o número: ");
		int num = input.nextInt();
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println(num + " não é Primo, é divisivel por " + i);
				ehPrimo = false;
			}
			
		}
		
		if(ehPrimo) {
			System.out.println(num + " é Primo.");
		}
		
		input.close();

	}

}
