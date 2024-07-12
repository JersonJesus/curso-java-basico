package com.ronin.cursojava.aula19.labs;
/*37. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
do elemento correspondente em A.*/

public class Exer37 {

	public static void main(String[] args) {
		
		int[] vetorA = {5,6,7,8,9},
			  vetorB = new int[vetorA.length];
		
		System.out.print("Gerando os valores = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("[" + vetorA[i] + "] ");
			
		}
		
		System.out.println();
		int fatorial;
		
		for (int i = 0; i < vetorA.length; i++) {
			fatorial = 1;
			for (int j = vetorA[i] ; j > 1; j--) {
				fatorial *= j;
			}
			 
		vetorB[i] = fatorial;
			
		}
		System.out.print("Gerando os fatoriais = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("["+vetorB[i]+"] ");
		}
		
	}

}
