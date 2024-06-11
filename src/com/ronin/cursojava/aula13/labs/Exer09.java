package com.ronin.cursojava.aula13.labs;
/*9. Faça um Programa que peça a temperatura em graus Farenheit,
transforme e mostre a temperatura em graus Celsius.
o C = (5 * (F-32) / 9).*/
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Temperatura em Fahrenheit (Fº): ");
		double temperaturaFahrenheit = input.nextDouble();
		
		double temperaturaCelsius = (5 * (temperaturaFahrenheit - 32) / 9);
		
		System.out.println("Temperatura em Celsius (Cº): " + temperaturaCelsius);
		

	}

}
