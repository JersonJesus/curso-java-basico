package com.ronin.cursojava.aula17.labs;
/*27. Faça um programa que calcule o número médio de alunos por turma.
Para isto, peça a quantidade de turmas e a quantidade de alunos para
cada turma. As turmas não podem ter mais de 40 alunos.*/
import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int numAlunos,
			numTurmas,
			soma = 0;
		boolean valorValido = false;
		double media;
		
		
		System.out.print("Numéro de turmas: ");
		numTurmas = input.nextInt();
		
		for (int i = 1; i <= numTurmas; i++) {
			
			valorValido = false;
			
			do {
				System.out.print("Número de Alunos da " + i + "ª Turma: ");
				numAlunos = input.nextInt();
				
				if (numAlunos <= 40) {
					soma+=numAlunos;
					valorValido = true;
				} else {
					System.out.println("A turma deve ter no mínimo 40 alunos.");
				}
				
			} while (!valorValido);
			
		}	
			
		media = (double)soma / numTurmas;
		
		System.out.println("Media: " + media);
		System.out.println("Soma: " + soma);
		
		input.close();	
		
		
		
		

	}

}
