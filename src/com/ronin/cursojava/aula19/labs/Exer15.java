package com.ronin.cursojava.aula19.labs;
/*15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.*/

import java.util.Random;

public class Exer15 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[] vetorA = new int[11];
		
		System.out.print("Vetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = rand.nextInt(10) + 1;
			
			System.out.print("[" + vetorA[i] + "]");
			
		}
		
		System.out.println();
		
		int numPares = 0,
			numImpares = 0;
		
		System.out.println();
		System.out.print("Números Pares: ");
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				System.out.print("[" + vetorA[i] + "]");
				numPares++;	
			}
		}
		
		double porcentPares = ((double)numPares / vetorA.length) *  100;
		System.out.println("\nPorcentagem de números Pares: " + porcentPares + "%");
		
		System.out.println();
		
		System.out.print("Números Ímpares: ");
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				System.out.print("[" + vetorA[i] + "]");
				numImpares++;
			}
		}
		double porcentImpares = ((double)numImpares / vetorA.length) *  100;
		System.out.println("\nPorcentagem de números Ímpares: " + porcentImpares + "%");
		
	}

}
