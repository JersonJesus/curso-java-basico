package com.ronin.cursojava.aula13.labs;

import java.util.Scanner;

/*8. Faça um Programa que pergunte quanto você ganha por hora e o
número de horas trabalhadas no mês. Calcule e mostre o total do seu
salário no referido mês.*/
public class Exer08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double valorHora;
		int horasTrabalhadas;
		
		System.out.print("Valor por Hora: " );
		valorHora = input.nextDouble();
		
		System.out.print("Horas Trabalhadas: ");
		horasTrabalhadas = input.nextInt();
		
		double salarioMensal = valorHora * horasTrabalhadas;
		
		System.out.println("Salário Mensal: " + salarioMensal + " $");
		
		

	}

}
