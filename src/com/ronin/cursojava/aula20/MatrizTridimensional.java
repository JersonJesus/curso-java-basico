package com.ronin.cursojava.aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {

		int[][][] matriz = new int[3][3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz[i][j].length; k++) {
					matriz[i][j][k] = (int)Math.round(Math.random () * 9);
					System.out.print(matriz[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		int soma = 0,
			somaPar = 0,
			somaImpar = 0;
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				for (int k = 0; k < matriz[i][j].length; k++) {
					
					soma += matriz[i][j][k];
					
					if (matriz[i][j][k] % 2 == 0) {
						somaPar += matriz[i][j][k];
					} else {
						somaImpar += matriz[i][j][k];
					} 
				}
			}
		}
		
		System.out.println("Soma total = " + soma);
		System.out.println("Soma total dos nºs Pares = " + somaPar);
		System.out.println("Soma total dos nºs Impares = " + somaImpar);
				
		
		

	}

}
