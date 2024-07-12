package com.ronin.cursojava.aula19.labs;

/*30. Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
que nos vetor B e C serão armazenados o valores pares e ímpares de
A, respectivamente.*/

public class Exer30 {

	public static void main(String[] args) {
		
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 20);
			System.out.print("[" + vetorA[i] + "] ") ;
			
		}	
		
		System.out.println();
		
		int posB = 0;
		int posC = 0;
		
		
		for (int i = 0; i < vetorB.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
				
			} else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
			
		}
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < posB; i++) {
			System.out.print("[" + vetorB[i] + "] ") ;
		}
		
		System.out.println();
		System.out.print("Vetor C = ");
		for (int i = 0; i < posC; i++) {
			System.out.print("[" + vetorC[i] + "] ") ;
		}

	}

}
