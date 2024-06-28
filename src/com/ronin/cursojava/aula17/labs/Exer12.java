package com.ronin.cursojava.aula17.labs;
/*12. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50*/


import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("Tabuada de: ");
		num = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num+ " X " + i  + " = " + (i * num));
		}
		
		input.close();
	}

}
