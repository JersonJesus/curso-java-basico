package com.ronin.cursojava.aula13;

public class OperadoresLogicos {

	public static void main(String[] args) {

	
		
		
		System.out.println("(3 > 9)" + "&&" + "(8 == 8)" + " = " + ((3 > 9) && (8 == 8)));
		System.out.println("(7 != 9)" + "||" + "(3 < 8)" + " = " + ((7 != 9) || (3 > 8)));
		System.out.println("!(3 < 9)" + "&&" + "!(4 < 8)" + " = " + (!(3 < 9) && !(4 > 8)));
		
	}

}
