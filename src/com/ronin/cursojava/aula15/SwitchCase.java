package com.ronin.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um DIA DA SEMANA: ");
		String num = input.nextLine();
		
		switch(num) {
		
			case "1": 
				System.out.println("Segunda-Feira");
			break;
			
			case "2": 
				System.out.println("Terça-Feira");
			break;
			
			case "3": 
				System.out.println("Quarta-Feira");
			break;
			
			default:
				System.out.println("Dia da Semana Inválido.");
		}

	}

}
