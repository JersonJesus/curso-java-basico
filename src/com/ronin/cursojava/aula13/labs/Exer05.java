package com.ronin.cursojava.aula13.labs;
/*5. Faça um Programa que converta metros para centímetros.*/
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double 	medidaMetros,
				medidaCentimetros;
		
		System.out.print("Digite a medida em metros: ");
		medidaMetros = input.nextDouble();
		
		medidaCentimetros = medidaMetros * 100;
		
		System.out.println("Medida em centímetros: " + medidaCentimetros + " cm.");

	}

}
