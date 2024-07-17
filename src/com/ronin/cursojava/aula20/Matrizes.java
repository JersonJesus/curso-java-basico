package com.ronin.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		int[][] notasAlunos = new int[5][4];
		
		int somaNotas;
		
		for (int i = 0; i < notasAlunos.length; i++) { 
			
			System.out.print("Notas do Aluno " + (i+1) + ": ");
			somaNotas = 0;
			
			for (int j = 0; j < notasAlunos[i].length; j++) {
				
				notasAlunos[i][j] = (int)Math.round(Math.random() * 20);
				System.out.print(notasAlunos[i][j] + " ");
				somaNotas += notasAlunos[i][j];
			}
			System.out.println();
			System.out.println("Media: " + (double)somaNotas / 4 + " valores.");
		}
		
		
	}

}
