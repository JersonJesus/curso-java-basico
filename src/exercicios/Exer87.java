package exercicios;

import java.util.Scanner;

/*87) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem personalizada, passada como parâmetro.
Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
+-------=======------+
Aprendendo Portugol
+-------=======------+*/
public class Exer87 {
    
    static void gerador(String mensagem){
        System.out.println("+-------=======------+");
        System.out.println(mensagem);
        System.out.println("+-------=======------+");
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma mensagem: ");
        String msg = input.nextLine();
        
        gerador(msg);
                
    }
    
}
