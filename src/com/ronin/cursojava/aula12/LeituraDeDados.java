package com.ronin.cursojava.aula12;

import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			
			System.out.print("Digite o seu nome: ");
			String nomeUsuario = input.nextLine();
			
			System.out.print("Digite a sua idade: " );
			int idade = input.nextInt();
			
			System.out.println("O seu nome é " + nomeUsuario + 
				" e você está com " + idade + " anos de idade.");
			
			
			

			
			
			
			
			
			
	}

}
