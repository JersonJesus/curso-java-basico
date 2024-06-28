package com.ronin.cursojava.aula17.labs;
/*33. O Departamento Estadual de Meteorologia lhe contratou para
desenvolver um programa que leia as um conjunto indeterminado de
temperaturas, e informe ao final a menor e a maior temperaturas
informadas, bem como a média das temperaturas.*/

import java.util.Scanner;

public class Exer33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double temperatura,
			   maiorTemperatura = Double.MIN_VALUE,
			   menorTemperatura = Double.MAX_VALUE,
			   soma = 0;
		
		for (int i = 1; i <=5; i++) {
			System.out.print("Digite a " + i + "ª temperatura: ");
			temperatura = input.nextDouble();
			
			if(temperatura > maiorTemperatura) {
				maiorTemperatura = temperatura;
			}
			
			if(temperatura < menorTemperatura) {
				menorTemperatura = temperatura;
			}
			
			soma += temperatura;
			
		}
		
		double media = soma / 5;
		
		System.out.println("Maior Temperatura: " + maiorTemperatura + "ºC");
		System.out.println("Menor Temperatura: " + menorTemperatura + "ºC");
		System.out.println("Média de Temperatura: " + media + "ºC");
		
		input.close();
		
	}

}
