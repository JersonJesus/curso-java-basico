package com.ronin.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		int idade = input.nextInt();
		
		System.out.print("Fase: ");
		if(idade < 13) {
			System.out.println("Infância");
		} else if(idade >= 13 && idade < 19) {
			System.out.println("Adolescência");
		} else {
			System.out.println("Adulta");
		}

	}

}
