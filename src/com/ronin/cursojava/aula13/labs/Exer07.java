package com.ronin.cursojava.aula13.labs;

import java.util.Scanner;

/*7. Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário.*/
public class Exer07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double 	lado,
				area,
				dobroArea;
		
		System.out.print("Digite o lado do quadrado: ");
		lado = input.nextDouble();
		
		area =  Math.pow(lado,2);
		
		System.out.println("Área do círculo: " + area);
		
		dobroArea = area * 2;
		System.out.println("Dobro da Área do círculo: " + dobroArea);

	}

}
