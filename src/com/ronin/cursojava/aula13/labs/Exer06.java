package com.ronin.cursojava.aula13.labs;

import java.util.Scanner;

/*6. Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.*/
public class Exer06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double 	raio,
				area;
		
		System.out.print("Digite o raio do círculo: ");
		raio = input.nextDouble();
		
		area = Math.PI * Math.pow(raio,2);
		
		System.out.println("Área do círculo: " + area);

	}

}
