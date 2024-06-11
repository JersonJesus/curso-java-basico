package com.ronin.cursojava.aula15.labs;
/*4. Faça um Programa que verifique se uma letra digitada é vogal ou
consoante.*/

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite uma letra: ");
		String letra = input.next();
		
		if(letra.equalsIgnoreCase("A") ||
		   letra.equalsIgnoreCase("E") ||
		   letra.equalsIgnoreCase("I") ||
		   letra.equalsIgnoreCase("O") ||
		   letra.equalsIgnoreCase("U") ) {
			
			System.out.println(letra  + " é uma Vogal.");
			
		} else {
			if(letra.length() > 1) {
				
				System.out.println("Não é uma letra válida");
				
			} else {
				
				System.out.println(letra  + " é uma Consoante.");
			}
			
		}
		
		input.close();
	}

}
