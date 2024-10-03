package exercicios;
/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.*/
import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double salarioFuncionario,
               novoSalario;
        
        System.out.print("Salario Atual: ");
        salarioFuncionario = input.nextDouble();
        
        novoSalario = salarioFuncionario + ((salarioFuncionario * 15) / 100);
        
        System.out.println("Novo Salário (aumento de 15%): " + novoSalario);
        
        input.close();
    }
}
