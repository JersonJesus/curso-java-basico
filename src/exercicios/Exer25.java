package exercicios;
/*25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.*/
import java.util.Scanner;

public class Exer25 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Lado A: ");
        double ladoA = input.nextDouble();
         
        System.out.print("Lado B: ");
        double ladoB = input.nextDouble();
         
        System.out.print("Lado C: ");
        double ladoC = input.nextDouble();
        
        if ((ladoA < ladoB + ladoC) && 
            (ladoB < ladoA + ladoC) && 
            (ladoC < ladoA + ladoB)) {
            
            System.out.println("É UM TRIÂNGULO");
        } else {
           System.out.println("NÃO É UM TRIÂNGULO"); 
        }
        
    }
}
