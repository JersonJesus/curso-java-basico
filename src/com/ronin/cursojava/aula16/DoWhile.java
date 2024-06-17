package com.ronin.cursojava.aula16;

public class DoWhile {

	public static void main(String[] args) {
		
		int i = 1,
			max = 10;
		
		do {
			System.out.print(i +" - ");
			i++;
		} while (i <= max);	
		System.out.println("FIM");
	}

}
