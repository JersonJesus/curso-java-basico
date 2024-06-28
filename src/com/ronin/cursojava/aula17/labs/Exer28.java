package com.ronin.cursojava.aula17.labs;
/*28. Faça um programa que calcule o valor total investido por um
colecionador em sua coleção de CDs e o valor médio gasto em cada
um deles. O usuário deverá informar a quantidade de CDs e o valor
para em cada um.*/

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numCDs;
		double precoCD;
		int soma = 0;
		double media;
		
		
		System.out.print("Numéro de CD's: ");
		numCDs = input.nextInt();
		
		for (int i = 1; i <= numCDs; i++) {
			
			System.out.print("Preço do CD " + i + ": ");
			precoCD = input.nextDouble();
		
			soma+=precoCD;
			
		}	
			
		media = (double)soma / numCDs;
		System.out.println("Total: " + soma);
		System.out.println("Media: " + media);
		
		
		input.close();	
		

	}

}
