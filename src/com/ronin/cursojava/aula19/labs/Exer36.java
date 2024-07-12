package com.ronin.cursojava.aula19.labs;
/*36. Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
cada elemento do vetor A é formado pela potência de base 2 elevado
ao expoente igual a posição do respectivo elemento, ou seja:
A[i] = 2i. Sugestão int A[11];*/



public class Exer36 {

	public static void main(String[] args) {
		
		double [] vetor = new double[5];
		
		System.out.print("Gerando os valores = ");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Math.pow(2, i);
			System.out.print("[" + vetor[i] + "] ");
			
		}
		
		System.out.println();
		

	}

}
