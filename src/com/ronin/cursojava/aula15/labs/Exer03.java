package com.ronin.cursojava.aula15.labs;
/*3. Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o seu Sexo: ");
		String sexo = input.next();
		
		if (sexo.equalsIgnoreCase("M")) {
			
			System.out.println("Sexo Masculino.");
			
		} else if (sexo.equalsIgnoreCase("F")){
			
			System.out.println("Sexo Femenino");
			
		} else {
			
			System.out.println("Sexo Inválido");
		}
		
		input.close();
	}

}
