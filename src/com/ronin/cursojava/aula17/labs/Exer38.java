package com.ronin.cursojava.aula17.labs;
import java.text.DecimalFormat;
/*38. Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
Esse funcionário foi contratado em 1995, com salário inicial de R$ 1.000,00;
a.Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
b.A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior. Faça um
programa que determine o salário atual desse funcionário. Após
concluir isto, altere o programa permitindo que o usuário digite o
salário inicial do funcionário.*/
import java.util.Scanner;

public class Exer38 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double salarioInicial = 1000,
				porcentual = 1.5;
		int ano = 1997;
		
		salarioInicial += (salarioInicial * porcentual) / 100;
		
		DecimalFormat format = new DecimalFormat("###,###.##");
		
		System.out.println("ANO   || SALÁRIO   ");
		
		for(int i = ano; i <= 2024; i++) {
			
			porcentual += 2;
			
			salarioInicial += (salarioInicial * porcentual) / 100;
			
			System.out.println(i + "     " + format.format(salarioInicial));
		}
		
		input.close();


	}

}
