package exercicios;

import java.util.Scanner;

/*94) [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado
Fibonacci() que recebe um único valor inteiro como parâmetro, indicando quantos
termos da sequência serão mostrados na tela. O seu procedimento deve receber
esse valor e mostrar primeiro quantidade de elementos solicitados.
Obs: Use os exercícios 70 e 75 para te ajudar na solução
Ex:
Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM*/
public class Exer94 {
    static void fibonacci(int num){
        int primeiro = 1,
            segundo = 1,
            proximo;
        
        for (int i = 1; i <= num; i++) {
            System.out.print(primeiro + " >> ");
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
        }
        System.out.println("FIM");
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Números de termos da sequência: ");
        int numTermos = input.nextInt();
        
        fibonacci(numTermos);
    }
}
