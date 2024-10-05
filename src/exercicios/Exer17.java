package exercicios;

import java.util.Scanner;

/*17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.*/
public class Exer17 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double velocidade;
        
        System.out.print("Velocidade (Km/h): ");
        velocidade = input.nextDouble();
        
        
        if (velocidade > 80) {
            System.out.println("Condutor Multado");
            
            double multa = (velocidade - 80) * 5;
            
            System.out.println("Multa: " + multa);
        }
        
        input.close();
    }
}
