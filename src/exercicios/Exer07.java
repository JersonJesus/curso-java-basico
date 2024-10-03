package exercicios;
/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/
import java.util.Scanner;

public class Exer07 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in, "ISO-8859-1");
        
        double num,
               dobro,
               tercaparte;
        
        System.out.print("Digite um número: ");
        num = input.nextDouble();
        
        dobro = num * 2;
        tercaparte = num / 3;
        
        System.out.println("O dobro de " + num + " é " + dobro);
        System.out.println("A terça parte de " + num + " é " + tercaparte);
        
        input.close();
    }
}
