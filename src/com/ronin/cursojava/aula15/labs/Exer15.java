package com.ronin.cursojava.aula15.labs;
/*15. Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;*/

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Lado A: ");
		double ladoA = input.nextDouble();
		
		System.out.print("Lado B: ");
		double ladoB = input.nextDouble();
		
		System.out.print("Lado C: ");
		double ladoC = input.nextDouble();
		
		if (ladoA < ladoB + ladoC &&
		   ladoB < ladoA + ladoC &&
		   ladoC < ladoA + ladoB) {
			
			if(ladoA == ladoB && ladoB == ladoC) {
				
				System.out.println("Triângulo Equilátero.");
				
			} else if(ladoA != ladoB && ladoB != ladoC && ladoC != ladoA) {
				
				System.out.println("Triângulo Escaleno.");
				
			} else if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
				
				System.out.println("Triângulo Isóceles.");
			}
			
		} else {
			System.out.println("Não forma um Triângulo.");
		}
		System.out.println("Olá mundo");
		input.close();

	}

}
