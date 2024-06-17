package com.ronin.cursojava.aula15.labs;
/*24. Faça um Programa que leia 2 números e em seguida pergunte ao
usuário qual operação ele deseja realizar. O resultado da operação
deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
b. inteiro ou decimal.*/

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("1º Valor: ");
		int valor1 = input.nextInt();
		
		System.out.print("2º Valor: ");
		int valor2 = input.nextInt();
		
		System.out.println("=====OPERAÇÕES=====");
		System.out.println("SOMA [1]");
		System.out.println("SUBTRAÇÃO [2]");
		System.out.println("DIVISÃO INTEIRA [3]");
		System.out.println("DIVISÃO REAL [4]");
		System.out.println("MULTIPLICAÇÃO [5]");
		System.out.println("===================");
		
		System.out.print("Escolha a Operação: ");
		
		double resultado = 0;
		boolean ehValida = true;
		int operacao = input.nextInt();
		
		switch(operacao) {
			case 1: 
				resultado = valor1 + valor2	;
			break;
			
			case 2: 
				resultado = valor1 - valor2	;
			break;
			
			case 3: 
				resultado = valor1 / valor2	;
			break;
			
			case 4: 
				resultado = (double)valor1 / valor2	;
			break;
			
			case 5: 
				resultado = valor1 * valor2	;
			break;
			
			default:
				System.out.println("Operação inválida");
				ehValida = false;
		}
		
		if(ehValida) {
			
			System.out.println("Resultado = " + resultado);
			
			if(resultado > 0) {
				System.out.println(resultado + " é positivo.");
			} else {
				System.out.println(resultado + " é negativo.");
			}
			
			if(resultado % 2 == 0) {
				System.out.println(resultado + " é par.");
			} else {
				System.out.println(resultado + " é impar.");
			}
			
		}
		
		
		
		input.close();
	}

}
