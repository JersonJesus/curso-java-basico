package com.ronin.cursojava.aula13.labs;

import java.util.Scanner;

/*2. Faça um Programa que peça um número e então mostre a
mensagem O número informado foi [número].*/
public class Exer02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Digite um número: ");
		num = input.nextInt();
		
		System.out.println("O número digitado foi " + num);
	}

}
