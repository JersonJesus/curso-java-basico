package com.ronin.cursojava.aula15.labs;
/*11. As Organizações Tabajara resolveram dar um aumento de salário aos
seus colaboradores e lhe contraram para desenvolver o programa que
calculará os reajustes.
o Faça um programa que recebe o salário de um colaborador e o
reajuste segundo o seguinte critério, baseado no salário atual:
o salários até R$ 280,00 (incluindo) : aumento de 20%
o salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
o salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
o salários de R$ 1500,00 em diante : aumento de 5% 
Após o aumento ser realizado, informe na tela:
o o salário antes do reajuste;
o o percentual de aumento aplicado;
o o valor do aumento;
o o novo salário, após o aumento.*/

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Salário Atual: ");
		double salarioAtual = input.nextDouble();
		
		
		int porcentualAumento = 0;
		
		if(salarioAtual <= 280) {
			
			porcentualAumento = 20;
			
			
		} else if (salarioAtual > 280 && salarioAtual <= 700) {
			
			porcentualAumento = 15;
			
			
		} else if (salarioAtual > 700 && salarioAtual <= 1500) {
			
			porcentualAumento = 10;
			
			
		} else {
			
			porcentualAumento = 5;

		}
		
		double novoSalario ;
		novoSalario = salarioAtual + (salarioAtual * porcentualAumento) / 100;
		
		System.out.println("Salário antes do reajuste: " + salarioAtual + "$.");
		System.out.println("Percentual de aumento aplicado: " + porcentualAumento + "%.");
		System.out.println("Valor do aumento: " + (salarioAtual * porcentualAumento) / 100 + "$.");
		System.out.println("Novo salário, após o aumento: " + novoSalario + "$");
		
		
		
		input.close();

	}

}
