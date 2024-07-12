package com.ronin.cursojava.aula19.labs;

/*28. Ler um vetor A com 10 elementos e construir um vetor B de mesmo
tipo e tamanho e com os mesmos elementos de A, sendo que estes
deverão estar invertidos, ou seja, o primeiro elemento de A passa a
ser o último de B, o segundo elemento de A passa a ser o penúltimo
de B e assim por diante.*/

public class Exer28 {

	public static void main(String[] args) {
		
		int[] vetorA = new int[10];
		
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 10);
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println();
		
		int[] vetorB = new int[vetorA.length];
		
		System.out.print("VetorB = ");
		for (int i = vetorB.length - 1 ; i > -1; i--) {
			vetorB[i] = vetorA[i];
			System.out.print("[" + vetorB[i] + "] ");
		}
	}

}
