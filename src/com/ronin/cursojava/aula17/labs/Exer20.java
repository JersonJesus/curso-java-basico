package com.ronin.cursojava.aula17.labs;

import java.util.Scanner;


public class Exer20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int fatorial;
		String resposta;
		boolean valorValido = false;
		int resultado;
		
		do {
			resultado = 1;
			
			System.out.print("Fatorial de: ");
			fatorial = input.nextInt();
			
			if(fatorial > 0 && fatorial < 16) {
				
				valorValido = true;
				
				for (int i = fatorial; i >= 1; i--) {
					
					resultado *= i;
					
				}
				System.out.print(resultado);
				
			} else {
				
				System.out.println("Valor Inválido\nDigite um valor entre 1 e 15");
			}
				
			System.out.println("\nDeseja calcular outro fatorial? [S/N]: ");
			resposta = input.next();
			
			if(resposta.equalsIgnoreCase("S")) {
				valorValido = false;
			} else {
				System.out.println("Programa Encerrado");
			}
			

		} while (!valorValido);
		

		input.close();


	}

}
