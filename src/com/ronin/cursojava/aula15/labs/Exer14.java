package com.ronin.cursojava.aula15.labs;
/*14. Faça um programa que lê as duas notas parciais obtidas por um aluno
numa disciplina ao longo de um semestre, e calcule a sua média. A
atribuição de conceitos obedece à tabela abaixo:
o Média de Aproveitamento Conceito
o Entre 9.0 e 10.0 A
o Entre 7.5 e 9.0 B
o Entre 6.0 e 7.5 C
o Entre 4.0 e 6.0 D
o Entre 4.0 e zero E
O algoritmo deve mostrar na tela as notas, a média, o conceito
correspondente e a mensagem “APROVADO” se o conceito for
A, B ou C ou “REPROVADO” se o conceito for D ou E.*/

import java.util.Scanner;


public class Exer14 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Digite a 1º nota: ");
	double nota1 = input.nextDouble();
	
	System.out.print("Digite a 2º nota: ");
	double nota2 = input.nextDouble();
	
	double mediaFinal = (nota1 + nota2) / 2;
	System.out.println("Média: " + mediaFinal + " valores.");
	
	String conceito = "",
		   situacao = "";
	
	if(mediaFinal < 4) {
		conceito = "E";
		situacao = "Reprovado";
	} else if(mediaFinal >= 4 && mediaFinal < 6) {
		conceito = "D";
		situacao = "Reprovado";
	} else if(mediaFinal >= 6 && mediaFinal < 7.5) {
		conceito = "C";
		situacao = "Aprovado";
	}  else if(mediaFinal >= 7.5 && mediaFinal < 9) {
		conceito = "B";
		situacao = "Aprovado";
	} else {
		conceito = "A";
		situacao = "Aprovado";
	}
	
	System.out.println("Conceito: " + conceito);
	System.out.println("Situação: " + situacao);
	input.close();
		

	}

}
