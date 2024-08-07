package com.ronin.cursojava.aula17.labs;
/*31. O Sr. Manoel Joaquim expandiu seus negócios para além dos
negócios de 1,99 e agora possui uma loja de conveniências. Faça um
programa que implemente uma caixa registradora rudimentar. O
programa deverá receber um número desconhecido de valores
referentes aos preços das mercadorias. Um valor zero deve ser
informado pelo operador para indicar o final da compra. O programa
deve então mostrar o total da compra e perguntar o valor em dinheiro
que o cliente forneceu, para então calcular e mostrar o valor do troco.
Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra. A saída deve ser conforme o exemplo
abaixo:
Lojas Tabajara

Produto 1: R$ 2.20
Produto 2: R$ 5.80
Produto 3: R$ 0

Total: R$ 9.00
Dinheiro: R$ 20.00
Troco: R$ 11.00
...*/
import java.util.Scanner;

public class Exer31 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double preco,
		       total = 0,
		       dinheiro = 0;
		int i = 1;
		boolean novaCompra = false;
		String resposta = " ";
		
		
		do {
			
			do {
				System.out.print("Preço do Produto " + i + " : ");
				preco = input.nextDouble();
				
				if(preco > 0) {
					
					total += preco;
					
					i++;
					
				} else if(preco == 0){
				
					System.out.println("Total: R$" + total);
					
					System.out.print("Dinheiro: R$");
					dinheiro = input.nextDouble();
					
					System.out.println("Troco: R$" + (dinheiro - total));
					
					i = 1;
					
					novaCompra = true;
				}
				
			} while (!novaCompra);
					
			System.out.print("Deseja fazer outra compra?[S/N]");
			resposta = input.next();
			
			if (resposta.equalsIgnoreCase("S")) {
				novaCompra = false;
			} else {
				System.out.println("PROGRAMA ENCERRADO");
			}
			
			
		} while (!novaCompra);
		
		input.close();

	}

}
