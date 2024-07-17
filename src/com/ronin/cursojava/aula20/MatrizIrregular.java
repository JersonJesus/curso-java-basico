package com.ronin.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[][] matrizIrregular = new int[3][];
		
		matrizIrregular[0] = new int[2];
		matrizIrregular[1] = new int[1];
		matrizIrregular[2] = new int[3];
		
		matrizIrregular[0][0] = 1;
		matrizIrregular[0][1] = 2;
		
		matrizIrregular[1][0] = 3;
		
		matrizIrregular[2][0] = 4;
		matrizIrregular[2][1] = 5;
		matrizIrregular[2][2] = 6;
		
		for (int i = 0; i < matrizIrregular.length; i++) {
			System.out.print("Linha " + i + ": ");
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.print(matrizIrregular[i][j] + " "); 
			}
			System.out.println();
		}
		
		
		input.close();

	}

}
