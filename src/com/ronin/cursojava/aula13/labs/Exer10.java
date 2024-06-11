package com.ronin.cursojava.aula13.labs;

import java.util.Scanner;

/*10. Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.*/
public class Exer10 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		
		System.out.print("Temperatura em Celsius (Cº): ");
		double temperaturaCelsius  = input.nextDouble();
		
		double temperaturaFahrenheit  = (temperaturaCelsius * 1.8) + 32;
		
		System.out.println("Temperatura em Fahrenheit (Fº): " + temperaturaFahrenheit);

	}

}
