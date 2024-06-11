package com.ronin.cursojava.aula15.labs;
/*2. Faça um Programa que peça um valor e mostre na tela se o valor é
positivo ou negativo.*/
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite um valor: ");
		int num = input.nextInt();
		
		if (num > 0) {
			System.out.println(num + " é um valor Positivo.");
		} else {
			System.out.println(num + " é um valor Negativo.");
		}
		
		input.close();
	}

}
