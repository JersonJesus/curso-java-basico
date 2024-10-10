package aula12;

import java.util.Scanner;

public class Números {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num,
            soma = 0;
        String respostaUsuario;
        
        do {            
            System.out.print("Digite um número: ");
            num = input.nextInt();
            
            soma+=num;
            
            System.out.print("Quer digitar outro número? [S/N]: ");
            respostaUsuario = input.next();
            
        } while (respostaUsuario.equalsIgnoreCase("SIM")|| respostaUsuario.equalsIgnoreCase("s"));
        
        System.out.println("Soma Total: " + soma);
    }
}
