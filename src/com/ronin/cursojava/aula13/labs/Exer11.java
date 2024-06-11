package com.ronin.cursojava.aula13.labs;

import java.util.Scanner;

/*11. Faça um Programa que peça 2 números inteiros e um número real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo .
b. a soma do triplo do primeiro com o terceiro.
c. o terceiro elevado ao cubo.*/
public class Exer11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1,
			num2;
		double num3;
		
		System.out.print("Digite o 1º valor: ");
		num1 = input.nextInt();
		
		System.out.print("Digite o 2º valor: ");
		num2 = input.nextInt();
		
		System.out.print("Digite o 3º valor: ");
		num3 = input.nextDouble();
		
		System.out.println("A)R: (" + num1 + " * " + 2 + ") * (" + num2 + " / 2) = "
						  + (num1 * 2) * (num2 / 2)); 
		System.out.println("B)R: (" + num1 + " * " + 3 + ") + " + num3 + " = "
						  + ( num1 * 3 + num3)); 
		System.out.println("C)R: "+num3 + " = " + Math.pow(num3,3)); 
	}

}
