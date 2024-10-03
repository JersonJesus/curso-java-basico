package exercicios;
/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.*/
import java.util.Scanner;

public class Exer15 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int diasTrabalhados;
        
        System.out.println("Dias Trabalhados: ");
        diasTrabalhados = input.nextInt();
        
        double salarioFuncionario;
        
        salarioFuncionario = diasTrabalhados * (25*8);
        
        System.out.println("Salário: " + salarioFuncionario);
        
        input.close();
    }
}
