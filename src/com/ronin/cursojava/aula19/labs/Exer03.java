package com.ronin.cursojava.aula19.labs;
/*3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o quadrado do respectivo elemento de A, ou seja:
B[i] = A[i] * A[I].*/

public class Exer03 {

	public static void main(String[] args) {
		
		int[] vetorA = {3,4,1,8,7,10,4,2,7,4,};
		int[] vetorB = new int[vetorA.length];
		
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("[" + (vetorB[i] = vetorA[i] * vetorA[i]) + "] ");
		}
		
	}

}
