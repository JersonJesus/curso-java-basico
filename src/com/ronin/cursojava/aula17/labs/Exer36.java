package com.ronin.cursojava.aula17.labs;
/*36. Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
devem ser informados também pelo usuário, conforme exemplo
abaixo:
Montar a tabuada de: 5
Começar por: 4
Terminar em: 7
Vou montar a tabuada de 5 começando em 4 e terminando em 7:
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor
que o inicial.*/

import java.util.Scanner;

public class Exer36 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int num,
			inicio,
			fim;
		boolean valorValido = false;
		
		System.out.print("Montar a tabuada de: ");
		num = input.nextInt();
		
		do {
			System.out.print("Começar por: ");
			inicio = input.nextInt();
			
			System.out.print("Terminar em:  ");
			fim = input.nextInt();
			
			if(inicio < fim) {
				valorValido = true;
				System.out.println("\nVou montar a tabuada de " + num + " "
						+ "começando em "+inicio+" e terminando em " + fim + ": \n");
				for (int i = inicio; i <= fim; i++) {
					System.out.println(num + " X " + i + " = " + (num * i));
				}
			} else {
				System.out.println("O valor final é menor que o inicial.");
			}
		} while (!valorValido);
		
		input.close();
	}

}
