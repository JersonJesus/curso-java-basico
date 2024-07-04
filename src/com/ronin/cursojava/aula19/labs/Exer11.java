package com.ronin.cursojava.aula19.labs;
/*11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a quantidade de elementos armazenados neste
vetor que são pares.*/

import java.util.*;

public class Exer11 {

	public static void main(String[] args) {
	
		Random rand = new Random();
		
		int[] vetorA = new int[5];
		
		System.out.print("Vetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = rand.nextInt(20) + 1;
			
			System.out.print("[" + vetorA[i] + "]");
			
		}
		
		System.out.println();
		
		int numPares = 0;
		
		System.out.print("Elementos pares no vetorA: ");
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] % 2 == 0) {
				System.out.print("[" + vetorA[i] + "]");
				
				numPares++;
			}
		}
		
		System.out.println("\nQuntidade de números pares: " + numPares);
		
	}

}
