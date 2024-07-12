package com.ronin.cursojava.aula19.labs;
/*31. Ler um vetor A com 20 elementos. Separar os elementos pares e
ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
do vetor B armazene os elementos pares de A e nas posições
restantes do vetor B armazene os elementos de A que são ímpares.*/

public class Exer31 {

	public static void main(String[] args) {
	
		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 30);
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println();
		
		int posB = 0;
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length ; i++) {
			if(vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
			
		}
		for (int i = 0; i < vetorB.length; i++) {
			if(vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
			
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("[" + vetorB[i] + "] ");
		}
		
	}

}
