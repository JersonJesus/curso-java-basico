package com.ronin.cursojava.aula19.labs;
/*29. Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
sendo este a junção dos dois outros vetores. Os primeiros 10
elementos de C deverão receber os elementos de A e os últimos
elementos C deverão receber os elementos de B. Desta forma, C
deverá ter o dobro de elementos de A e B, ou seja, 20 elementos.*/

public class Exer29 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[10];
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int)Math.round(Math.random() * 30);
			vetorC[i] = vetorA[i];
			System.out.print("[" + vetorA[i] + "] ");
			
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			vetorB[i] = (int)Math.round(Math.random() * 30);
			vetorC[vetorB.length+i] = vetorB[i];
			System.out.print("[" + vetorB[i] + "] ");
			
		}
		
		System.out.println();
	
		System.out.print("Vetor C = ");
		for(int i = 0; i < vetorC.length; i++) {
			System.out.print("[" + vetorC[i] + "] ");
		}
		
		
		
	}

}
