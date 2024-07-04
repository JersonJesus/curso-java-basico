package com.ronin.cursojava.aula19.labs;
/*19. Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.*/


import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		double[] vetorNota1 = new double[10],
				 vetorNota2 = new double[vetorNota1.length];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Vetor Nota1: ");
		for (int i = 0; i < vetorNota1.length; i++) {
			System.out.print("Nota do Aluno" + (i + 1) + ": ");
			vetorNota1[i] = input.nextDouble();
		}
		
		System.out.println();
		
		System.out.println("Vetor Nota2: ");
		for (int i = 0; i < vetorNota2.length; i++) {
			System.out.print("Nota do Aluno" + (i + 1) + ": ");
			vetorNota2[i] = input.nextDouble();
		}
		
		System.out.println();
		
		double[] vetorResultado = new double[vetorNota1.length];
		String resultado = " ";
		
		System.out.println("   Média  |  Resultado: ");
		for (int i = 0; i < vetorResultado.length; i++) {
			vetorResultado[i] = (vetorNota1[i] + vetorNota2[i]) /  2;
			
			if(vetorResultado[i] >= 7) {
				resultado = "Aprovado";
			} else {
				resultado = "Reprovado";
			}
			
			System.out.println("Aluno "+(i + 1) + ": " + vetorResultado[i] + " | " + resultado);
			
		}
		
	
		input.close();
	}

}
