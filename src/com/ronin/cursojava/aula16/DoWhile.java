package com.ronin.cursojava.aula16;

public class DoWhile {

	public static void main(String[] args) {
		
		int i = 1,
			max = 10;
		
		System.out.println("Contando de 1 á 10 usando a estrutura do-while");
		
		do {
			System.out.print(i + " - ");
			i++;
		} while (i <= max);	
		
		System.out.println("FIM");
	}

}
