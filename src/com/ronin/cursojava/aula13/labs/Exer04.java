package com.ronin.cursojava.aula13.labs;
/*4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double 	nota1,
				nota2,
				nota3,
				nota4,
				mediaFinal;
		
		System.out.print("Digite a 1º nota: ");
		nota1 = input.nextDouble();
		
		System.out.print("Digite a 2º nota: ");
		nota2 = input.nextDouble();
		
		System.out.print("Digite a 3º nota: ");
		nota3 = input.nextDouble();
		
		System.out.print("Digite a 4º nota: ");
		nota4 = input.nextDouble();
		
		mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média Final: " + mediaFinal + " valores.");

	}

}
