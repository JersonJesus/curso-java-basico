package com.ronin.cursojava.aula15.labs;

/*13. Faça um Programa que leia um número e exiba o dia correspondente
da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
aparecer valor inválido.*/
import java.util.Scanner;



public class Exer13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite o número do dia da semana: ");
		int valor = input.nextInt();

		switch (valor) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		default:
			System.out.println("Valor Inválido.");
		}
		
		input.close();

	}

}
