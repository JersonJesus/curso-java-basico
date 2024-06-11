package com.ronin.cursojava.aula13.labs;

import java.util.Scanner;

/*12. Tendo como dados de entrada a altura de uma pessoa, construa um
algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
(72.7*altura) - 58*/
public class Exer12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double alturaUsuario;
		
		System.out.print("Altura: ");
		alturaUsuario = input.nextDouble();
		
		double pesoIdeal = (72.7 * alturaUsuario) - 58;
		
		System.out.println("Peso Ideal: " + pesoIdeal + " Kg.");

	}

}
