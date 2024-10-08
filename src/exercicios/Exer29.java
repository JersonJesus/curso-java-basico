package exercicios;

/*29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20%*/

import java.util.Scanner;

public class Exer29 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Nome Funcionario: ");
        String nomeFuncionario = input.nextLine();
        
        System.out.print("Salário Atual: ");
        double salarioAtual = input.nextDouble();
        
        System.out.print("Anos de Trabalho: ");
        int anosTrabalho = input.nextInt();
        
        double porcentagem;
        
        if (anosTrabalho <= 3) {
            porcentagem = 3;
        } else if (anosTrabalho > 3 && anosTrabalho <= 10){
            porcentagem = 12.5;
        } else {
            porcentagem = 20;
        }
        
        double novoSalario = salarioAtual + (salarioAtual * porcentagem) / 100;
        System.out.println("Novo Salário: " + novoSalario);
        
        input.close();
        
    }
}
