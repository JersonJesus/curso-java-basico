package com.ronin.cursojava.aula19.labs;
/*38. Ler um vetor A com 10 elementos. Construir um vetor B de mesmo tipo
e tamanho, sendo que cada elemento de B deverá ser o seguinte
somatório: Bi = Somatório de Aj, para todo j variando de i até 10.*/


import java.util.Random;

public class Exer38 {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		int[] vetorA = new int[5];
		
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(10) + 1;
			System.out.print("[" + vetorA[i] + "] ");
			
		}
		
		System.out.println();
		
		int[] vetorB = new int[5];
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			
			for (int j = 1; j <= 10; j++) {
				vetorA[i] += j;
			}
			System.out.print("[" + (vetorB[i] = vetorA[i]) + "] ");
			;
		}
	}

}
