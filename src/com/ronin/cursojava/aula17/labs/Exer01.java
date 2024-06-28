package com.ronin.cursojava.aula17.labs;
/*1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double nota;
		boolean notaValida = false;
		
		do {
			System.out.print("Nota: ");
			nota = input.nextDouble();
			
			if (nota >=0 && nota <= 10) {
				System.out.println("NOTA VÁLIDA");
				notaValida = true;
			} else {
				System.out.println("NOTA INVÁLIDA");
			}
		} while (!notaValida);
		
		input.close();
			
			
		
		
	
			
			
			
	
			
		
			
			
		
			
			input.close();
		
		
	}

}
