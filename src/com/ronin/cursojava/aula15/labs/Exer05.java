package com.ronin.cursojava.aula15.labs;
/*5. Faça um programa para a leitura de duas notas parciais de um aluno.
O programa deve calcular a média alcançada por aluno e apresentar:
o A mensagem "Aprovado", se a média alcançada for maior ou
igual a sete;
o A mensagem "Reprovado", se a média for menor do que sete;
o A mensagem "Aprovado com Distinção", se a média for igual a
dez.*/
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o 1º valor: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Digite o 2º valor: ");
		double nota2 = input.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.println("Média: " + media + "Valores.");
		
		if(media == 10) {
			
			System.out.println("Aprovado com Distinção");
			
		} else if(media >= 7){
			
			System.out.println("Aprovado.");
			
		} else {
			
			System.out.println("Reprovado");
		}
		
		input.close();
	}

}
