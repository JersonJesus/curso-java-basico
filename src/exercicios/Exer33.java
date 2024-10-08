package exercicios;
/*33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.*/
import java.util.Scanner;

public class Exer33 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Valor da Casa: ");
        double valorCasa = input.nextInt();
        
        System.out.print("Salário Comprador: ");
        double salarioComprador = input.nextDouble();
        
        System.out.print("Em quantos anos vai pagar: ");
        int anos = input.nextInt();
        
        double prestacaoMensal = valorCasa / (anos * 12);
        System.out.printf("Prestação Mensal: %.2f $\n",prestacaoMensal);
        
        if (prestacaoMensal >= (salarioComprador * 30) / 100) {
            System.out.println("Empréstimo Negado\nSalário insuficiente");
        } else {
            System.out.println("Empréstimo Concedido");
        }
        
        input.close();
    }
}
