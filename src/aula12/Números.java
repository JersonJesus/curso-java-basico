package aula12;

import java.util.Scanner;

public class N�meros {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num,
            soma = 0;
        String respostaUsuario;
        
        do {            
            System.out.print("Digite um n�mero: ");
            num = input.nextInt();
            
            soma+=num;
            
            System.out.print("Quer digitar outro n�mero? [S/N]: ");
            respostaUsuario = input.next();
            
        } while (respostaUsuario.equalsIgnoreCase("SIM")|| respostaUsuario.equalsIgnoreCase("s"));
        
        System.out.println("Soma Total: " + soma);
    }
}
