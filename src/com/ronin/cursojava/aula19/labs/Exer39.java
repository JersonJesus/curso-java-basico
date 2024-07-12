package com.ronin.cursojava.aula19.labs;

/*39. Criar dois vetores A e B cada um com 10 elementos inteiros.
Desenvolver um programa que realize a interseção dos vetores A e B
para produzir um vetor C. Interseção de conjuntos = todos os
elementos que existem em A e também existem em B.*/

public class Exer39 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[6];
		int[] vetorB = new int[6];
		int[] vetorC = new int[6];
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 10);
			System.out.print("[" + vetorA[i] + "] ") ;
			
		}	
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = (int)Math.round(Math.random() * 10);
			System.out.print("[" + vetorB[i] + "] ") ;
			
		}	 
		
		System.out.println();
		
		int posC = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			for (int j = 0; j < vetorB.length; j++) {
				if(vetorA[i] != vetorB[j]) {
					vetorC[posC] = vetorA[i];
					posC++;
					break;
					
				}
			}
		}
		System.out.print("Vetor C = ");
		for (int i = 0; i < posC; i++) {
			System.out.print("[" + vetorC[i] + "] ") ;
		}
	}

}
