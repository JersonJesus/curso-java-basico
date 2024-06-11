package com.ronin.cursojava.aula15.labs;
/*1. Faça um Programa que peça dois números e imprima o maior deles.*/
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o 1º valor: ");
		int num1 = input.nextInt();
		
		System.out.print("Digite o 2º valor: ");
		int num2 = input.nextInt();
		
		int maiorNum;
		
		if (num1 > num2) {
			maiorNum = num1;
		} else {
			maiorNum = num2;
		}
		
		System.out.println("O Maior valor digitao foi " + maiorNum);
		
		input.close();
		

	}

}
