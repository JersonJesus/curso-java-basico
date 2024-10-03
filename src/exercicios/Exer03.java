package exercicios;
/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in, "ISO-8859-1");
        
        System.out.print("Nome do Funcionário: ");
        String nomeFuncionario = input.nextLine();
        
        System.out.print("Salário: ");
        double salarioFuncionario = input.nextDouble();
        
        System.out.println("O funcionário " + nomeFuncionario + " tem um salário de R$" + salarioFuncionario + " em Junho.");
        
        input.close();
    }
}
