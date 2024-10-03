package exercicios;
/*11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.*/
import java.util.Scanner;

public class Exer11 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double a,
            b,
            c, 
            delta;
        
        System.out.print("a = ");
        a = input.nextDouble();
        
        System.out.print("b = ");
        b = input.nextDouble();
        
        System.out.print("c = ");
        c = input.nextDouble();
        
        delta = Math.pow(b, 2) - 4 * a * c;
        
        System.out.println("Delta = " + delta);
        
        input.close();
    }
}
