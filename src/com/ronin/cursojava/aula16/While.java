package com.ronin.cursojava.aula16;

public class While {

	public static void main(String[] args) {
		
		int i = 1,
			max = 10;
		
		System.out.println("Contando de 1 á 10 usando a estrutura while");;
		
		while(i <= max) {
			System.out.print(i + " - ");
			i++;
		}
		
		System.out.println("FIM");
	}

}
