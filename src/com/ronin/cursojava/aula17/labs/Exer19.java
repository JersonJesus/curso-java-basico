package com.ronin.cursojava.aula17.labs;
/*19. Altere o programa anterior para que ele aceite apenas números entre 0
e 1000.*/

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num = 0,
			soma = 0,
			maior = Integer.MIN_VALUE,
			menor = Integer.MAX_VALUE;
			int i = 1;
		boolean numValido = false;
			
			do {
				while (i <= 5) {
					System.out.print("Digite o " + i + "º valor: ");
					num = input.nextInt();
					
					if(num >= 0 && num <= 100) {
						
						numValido = true;
						
						soma+=num;
						
						if(num > maior) {
							maior = num ;
						}
						
						if(num < menor) {
							menor = num ;
						}
						 i++;
					} else {
						
						System.out.println("Número Inválido!\nDigite um valor entre 1 e 100");
						
					}
				}
				
			} while (!numValido);
					
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("Soma dos valores digitados = " + soma);
			
		input.close();

	}

}
