/*99) Fa�a um programa que possua uma fun��o chamada Potencia(), que vai receber
dois par�metros num�ricos (base e expoente) e vai calcular o resultado da
exponencia��o.
Ex: Potencia(5,2) vai calcular 5 = 25*/
package exercicios;

import java.util.Scanner;

public class Exer99 {
    
    public static double potencia(int base, int expoente){
        double pot = Math.pow(base, expoente);
        
        return pot;
    } 
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a base: ");
        int base = input.nextInt();
        
        System.out.print("Digite o expoente: ");
        int expoente = input.nextInt();
        
        double potencia = potencia(base, expoente);
        
        System.out.println(base + " elevado a "  + expoente + " � igual a " + potencia);
    }
}
