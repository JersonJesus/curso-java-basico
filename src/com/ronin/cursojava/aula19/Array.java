package com.ronin.cursojava.aula19;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		vetor[0] = 3;
		vetor[1] = 6;
		vetor[2] = 1;
		vetor[3] = 8;
		vetor[4] = 4;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Vetor na posição " + i + " = " + vetor[i]);
		}
		
		input.close();
		

	}

}
