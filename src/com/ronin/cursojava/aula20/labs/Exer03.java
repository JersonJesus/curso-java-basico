package com.ronin.cursojava.aula20.labs;
/*3. Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.*/

public class Exer03 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		System.out.println("Gerando a Matriz: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)Math.round(Math.random() * 9);
				System.out.print("[" + matriz[i][j] + "] ");
			}
			System.out.println();
		}
		
		int qtdPares = 0,
			qtdImpares = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}
		System.out.println();
		System.out.println("Números Pares = " + qtdPares);
		System.out.println("Números Pares = " + qtdImpares);
	}

}
