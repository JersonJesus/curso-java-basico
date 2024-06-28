package com.ronin.cursojava.aula17.labs;
/*5. Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.*/

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int paisA ,
			paisB; 
		double	porcentPaisA,
				porcentPaisB;
		int	anos = 0;
		boolean dadoValido = false;
		
		
		
		do {
			System.out.print("População do País A: ");
			paisA = input.nextInt();
			
			if (paisA > 0) {
				dadoValido = true;
			} else {
				System.out.println("O País A deve ter a População maior que 0.");
			}
		} while (!dadoValido);
		
		dadoValido = false;
		
		do {
			System.out.print("Porcentagem de Crescimento do País A: ");
			porcentPaisA = input.nextDouble();
			
			if (porcentPaisA > 0) {
				dadoValido = true;
			} else {
				System.out.println("A Porcentagem do País A deve ser maior que 0.");
			}
		} while (!dadoValido);
		
		dadoValido = false;
		
		do {
			System.out.print("População do País B: ");
			paisB = input.nextInt();
			
			if (paisB > 0) {
				dadoValido = true;
			} else {
				System.out.println("O País B deve ter a População maior que 0.");
			}
		} while (!dadoValido);
		
		dadoValido = false;
		
		do {
			System.out.print("Porcentagem de Crescimento do País B: ");
			porcentPaisB = input.nextDouble();
			
			if (porcentPaisB > 0) {
				dadoValido = true;
			} else {
				System.out.println("A Porcentagem do País B deve ser maior que 0.");
			}
		} while (!dadoValido);
		
		while (paisA <= paisB) {
			paisA += ((paisA * porcentPaisA) / 100);
			paisB+=  ((paisB * porcentPaisB) / 100);
			
			anos++;
		}
		
		System.out.println("País A: " + paisA);
		System.out.println("País B: " + paisB);
		System.out.println("Serão necessário " + anos + " anos para o País A ultrapassar o País B.");
		input.close();
		
		
		
	}

}
