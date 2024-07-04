package com.ronin.cursojava.aula19.labs;
/*14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a média aritmética simples dos elementos
ímpares armazenados neste vetor.*/

import java.util.Random;

public class Exer14 {

	public static void main(String[] args) {
		
		
		Random rand = new Random();
		
		int[] vetorA = new int[5];
		
		System.out.print("Vetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = rand.nextInt(20) + 1;
			
			System.out.print("[" + vetorA[i] + "]");
			
		}
		
		System.out.println();
		
		int somaImpar = 0,
			numImpares = 0;
		
		System.out.print("Elementos Impares no vetorA: ");
		
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 != 0) {
				
				numImpares++;
				
				System.out.print("[" + vetorA[i] + "]");
				
				somaImpar += vetorA[i];
				
			}
		}
		
		double media = (double)somaImpar / numImpares;
		System.out.println("\nMédia de números Impares no vetorA: " + media);
	}

}
