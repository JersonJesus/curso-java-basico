package com.ronin.cursojava.aula17.labs;
/*25. Faça um programa que peça para n pessoas a sua idade, ao final o
programa devera verificar se a média de idade da turma varia entre 0 e
25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta
ou idosa, conforme a média calculada.*/

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		int idade,
			soma = 0;
		double media;
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("Digite " + i + "º a idade: ");
			idade = input.nextInt();
			
			soma += idade; 
			
		}
		media = soma / 5;
		
		System.out.println("Média: " + media);
		
		if (media > 0 && media <= 25) {
			System.out.println("Turma Jovem");
		} else if (media > 25 && media <= 60){
			System.out.println("Turma Adulta");
		} else {
			System.out.println("Turma Jovem");
		}

		input.close();
	}

}
