package com.ronin.cursojava.aula19.labs;
/*20. Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
A[i] = cotação do dolar * i, para todo i variando de 1 até 20.*/

public class Exer20 {

	public static void main(String[] args) {
		
		double[] vetorDolar = new double[20];
		double cotacaoUS = 5.50;
		
		for (int i = 0; i < vetorDolar.length; i++) {
			vetorDolar[i] = cotacaoUS * (i+1);
			
			System.out.println((i+1) + " R$ = " + vetorDolar[i] + " U$");
			
		}
		
		
		

	}

}
