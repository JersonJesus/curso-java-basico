package exercicios;

import java.util.Scanner;

/*88) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
+-------=======------+
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
+-------=======------+*/
public class Exer88 {
    
    static void gerador(String mensagem, int numVezes){
        System.out.println("+-------=======------+");
        for (int i = 1; i <= numVezes; i++) {
            System.out.println(mensagem);
        }
        System.out.println("+-------=======------+");
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma mensagem: ");
        String msg = input.nextLine();
        
        System.out.print("Digite o número de vezes: ");
        int vezes = input.nextInt();
        
        gerador(msg, vezes);
        
    }
}
