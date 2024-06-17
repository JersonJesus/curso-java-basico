package com.ronin.cursojava.aula16;

public class While {

	public static void main(String[] args) {
		
		int i = 0,
			max = 10;
		
		System.out.println("Contando até " + max);
		
		while(i <= max) {
			System.out.print(i + " - ");
			i++;
		}
		System.out.println("FIM");
	}

}
