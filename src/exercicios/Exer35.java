package exercicios;

/*35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
tabela a seguir:
- Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km
- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km*/

import java.util.Scanner;

public class Exer35 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Tipo de Carro (P/L): ");
        char tipoCarro = input.next().charAt(0);
        
        System.out.print("Dias de Aluguel: ");
        int diasAluguel = input.nextInt();
        
        System.out.print("Kilómetros Percorridos: ");
        double kmPercorridos = input.nextDouble();
        
        double totalPagar = 0; 
        
        if (tipoCarro == 'P' || tipoCarro == 'p') {
            if (kmPercorridos <= 100) {
                totalPagar = (diasAluguel * 90) + (kmPercorridos * 0.20);
            } else {
                totalPagar = (diasAluguel * 90) + (kmPercorridos * 0.10);
            }
        } else if (tipoCarro == 'L' || tipoCarro == 'l') {
             if (kmPercorridos <= 200) {
                totalPagar = (diasAluguel * 150) + (kmPercorridos * 0.30);
            } else {
                totalPagar = (diasAluguel * 150) + (kmPercorridos * 0.25);
            }
        }
        
        System.out.println("Total a Pagar: " + totalPagar);
        
        input.close();
    }
}
