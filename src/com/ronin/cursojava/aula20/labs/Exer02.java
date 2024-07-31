package com.ronin.cursojava.aula20.labs;
/*2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre
0-9. Após isso indique qual é o maior e o menor valor da linha 5 e
qual é o maior e o menor valor da coluna 7.*/

public class Exer02 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		System.out.println("Gerando a Matriz: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)Math.round(Math.random() * 100);
				System.out.print("[" + matriz[i][j] + "] ");
			}
			System.out.println();
		}
		int maiorLinha5 = Integer.MIN_VALUE,
			menorLinha5 = Integer.MAX_VALUE;
		
		int maiorColuna7 = Integer.MIN_VALUE,
		    menorColuna7 = Integer.MAX_VALUE;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 4) {
					if (matriz[4][j] > maiorLinha5) {
						maiorLinha5 = matriz[4][j];
						
					}
					
					if (matriz[4][j] < menorLinha5) {
						menorLinha5 = matriz[4][j];
						
					}	
				}
				
				if (j == 6) {
					if (matriz[i][6] > maiorColuna7) {
						maiorColuna7 = matriz[i][6];
						
					}
					
					if (matriz[i][6] < menorColuna7) {
						menorColuna7 = matriz[i][6];
						
					}	
				}
			}
		}
		System.out.println();
		System.out.println("Maior valor da 5ª Linha = " + maiorLinha5);
		System.out.println("Menor valor da 5ª Linha = " + menorLinha5);
		System.out.println("Maior valor da 7ª Coluna = " + maiorColuna7);
		System.out.println("Menor valor da 7ª Coluna = " + menorColuna7);
	}

}
