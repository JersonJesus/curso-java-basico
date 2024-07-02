package com.ronin.cursojava.aula19.labs;
/*4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]).*/

public class Exer04 {

	public static void main(String[] args) {
		
		int[] vetorA = {25,16,4,9,36};
		double[] vetorB = new double[vetorA.length];
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
	
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("[" + (vetorB[i] = Math.sqrt(vetorA[i])) + "]");
		}
	}

}
