package exercicios;
/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.*/
import java.util.Scanner;

public class Exer09 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in, "ISO-8859-1");
        
        double valorReal,
               valorDolar;
        
        System.out.print("Valor em R$: ");
        valorReal = input.nextDouble();
        
        valorDolar = valorReal / 3.45;
        
        System.out.println("Valor em US$: " + valorDolar);
        
        input.close();
        
    }
}
