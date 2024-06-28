package com.ronin.cursojava.aula17.labs;

import java.util.Scanner;

/*26. Numa eleição existem três candidatos. Faça um programa que peça o
número total de eleitores. Peça para cada eleitor votar e ao final
mostrar o número de votos de cada candidato.*/

public class Exer26 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int candidatoA = 0,
			candidatoB = 0,
			candidatoC = 0,
			numEleitores;
		String voto;
		
		System.out.print("Número de Eleitores: ");
		numEleitores = input.nextInt();
		
		System.out.println("\nCANDIDATO A || CANDIDATO B || CANDIDATO C \n");
		for (int i = 1; i <= numEleitores; i++) {
			
			System.out.print("VOTO Nº" + i + ": ");
			voto = input.next();
			
			if (voto.equalsIgnoreCase("A")) {
				candidatoA++;
			} else if (voto.equalsIgnoreCase("B")){
				candidatoB++;
			} else if (voto.equalsIgnoreCase("C")){
				candidatoC++;
			}
		}
		
		System.out.println("=====RESULTADOS=====");
		System.out.println("Candidato A: " + candidatoA + " votos.");
		System.out.println("Candidato B: " + candidatoB + " votos.");
		System.out.println("Candidato C: " + candidatoC + " votos.");
		
		input.close();
				
	}

}
