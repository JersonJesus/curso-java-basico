package exercicios;
/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.*/
import java.util.Scanner;

public class Exer14 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double KilometrosPercorridos;
        int diasAluguel;
        
        System.out.print("Kilómetros Percorridos: ");
        KilometrosPercorridos = input.nextDouble();
        
        System.out.print("Dias de Aluguel: ");
        diasAluguel = input.nextInt();
        
        double totalPagar;
        
        totalPagar = (diasAluguel * 90) + (KilometrosPercorridos * 0.20);
        
        System.out.println("Total a Pagar: " + totalPagar);
        
        input.close();
    }
}
