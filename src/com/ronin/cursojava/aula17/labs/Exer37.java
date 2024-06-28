package com.ronin.cursojava.aula17.labs;
/*37. Uma academia deseja fazer um senso entre seus clientes para
descobrir o mais alto, o mais baixo, a mais gordo e o mais magro, para
isto você deve fazer um programa que pergunte a cada um dos
clientes da academia seu código, sua altura e seu peso. O final da
digitação de dados deve ser dada quando o usuário digitar 0 (zero) no
campo código. Ao encerrar o programa também deve ser informados
os códigos e valores do clente mais alto, do mais baixo, do mais gordo
e do mais magro, além da média das alturas e dos pesos dos clientes*/

import java.util.Scanner;

public class Exer37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String codigo;
		double peso,
			   altura;
		boolean encerrar = false;
		
		String codigoAlto = " ";
		double alturaAlto = Double.MIN_VALUE;
		
		String codigoBaixo  = " ";
		double alturaBaixo = Double.MAX_VALUE;
		
		String codigoMagro  = " ";
		double pesoMagro = Double.MAX_VALUE;
		
		String codigoGordo  = " ";
		double pesoGordo = Double.MIN_VALUE;
		
		
		
		do {
			
			System.out.print("Código: ");
			codigo = input.next();
			
			if(codigo.equals("0")) {
				
				System.out.println("=====PROGRAMA ENCERRADO=====");
				encerrar = true;
				
			} else {
				
				System.out.println("=====Cliente nº" + codigo + "=====");
				
				System.out.print("Peso: ");
				peso = input.nextDouble();
				
				System.out.print("Altura: ");
				altura = input.nextDouble();
				
				System.out.println("=======================");
				
				//VERIFICANDO O MAIS GORDO
				if(peso > pesoGordo) {
					codigoGordo = codigo;
					pesoGordo = peso;
				}
				
				//VERIFICANDO O MAIS MAGRO
				if(peso < pesoMagro) {
					codigoMagro = codigo;
					pesoMagro = peso;
				}
				
				//VERIFICANDO O MAIS ALTO
				if(altura > alturaAlto) {
					codigoAlto = codigo;
					alturaAlto = altura;
				}
				
				//VERIFICANDO O MAIS ALTO
				if(altura < alturaBaixo) {
					codigoBaixo = codigo;
					alturaBaixo = altura;
				}
				
			}
			
		} while (!encerrar);
		
			System.out.println("\n====Mais Alto====");
			System.out.println("Código: " + codigoAlto);
			System.out.println("Altura: " + alturaAlto);
			
			System.out.println("====Mais Baixo====");
			System.out.println("Código: " + codigoBaixo);
			System.out.println("Altura: " + alturaBaixo);
			
			System.out.println("====Mais Gordo====");
			System.out.println("Código: " + codigoGordo);
			System.out.println("Peso: " + pesoGordo);
			
			System.out.println("====Mais Magro====");
			System.out.println("Código: " + codigoMagro);
			System.out.println("Peso: " + pesoMagro);
		
		
		input.close();

	}

}
