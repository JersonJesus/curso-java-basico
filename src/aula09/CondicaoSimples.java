package aula09;

import java.util.Scanner;

public class CondicaoSimples {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1ª Nota: ");
        double nota1 = input.nextDouble();
        
        System.out.print("2ª Nota: ");
        double nota2 = input.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media );
        
        if(media > 9){
            System.out.println("Parabéns!");
        }
        
    }
}
