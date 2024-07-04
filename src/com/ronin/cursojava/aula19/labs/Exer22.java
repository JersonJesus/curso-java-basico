package com.ronin.cursojava.aula19.labs;


/*22. Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A.*/

public class Exer22 {
	
	public static void main(String[] args) {
		
		
		int[] vetorA = new int[5];
		int valor0 = 0,
			valor1 = 0;
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			
			vetorA[i] = (int)Math.round(Math.random() * 1);
			
			if(vetorA[i] == 0) {
				valor0++;
			} else {
				valor1++;
			}
			
			System.out.print("[" + vetorA[i] + "] ");
		}
		
		System.out.println();
		
		System.out.println("Porcentagem de 0 no vetorA: " + (valor1  * 100)/ vetorA.length);
		System.out.println("Porcentagem de 1 no vetorA: " + (valor0 * 100)/ vetorA.length);
		
	}

}
