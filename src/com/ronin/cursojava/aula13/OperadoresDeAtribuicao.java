package com.ronin.cursojava.aula13;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {

			int n1 = 5,
				n2 = 3,
				res;
			System.out.println("n1 = " + n1);
			System.out.println("n2 = " + n2);
			//PRÉ-INCREMENTO
			res = 3 + ++n1;
			System.out.println("Pré-Incremento => 3 + ++n1 = " + res);
			//PRÉ-DECREMENTO
			res = 3 + --n2;
			System.out.println("Pré-Decremento => 3 + --n2 = " + res);
			//PÓS-INCREMENTO
			res = 2 + n1++;
			System.out.println("Pós-Incremento => 4 + n1++ = " + res);
			//PÓS-DECREMENTO
			res = 2 + n2--;
			System.out.println("Pós-Decremento => 4 + n2-- = " + res);
			
				
	}

}
