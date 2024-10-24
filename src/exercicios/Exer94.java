package exercicios;

import java.util.Scanner;

/*94) [DESAFIO] Desenvolva um aplicativo que tenha um procedimento chamado
Fibonacci() que recebe um �nico valor inteiro como par�metro, indicando quantos
termos da sequ�ncia ser�o mostrados na tela. O seu procedimento deve receber
esse valor e mostrar primeiro quantidade de elementos solicitados.
Obs: Use os exerc�cios 70 e 75 para te ajudar na solu��o
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
        
        System.out.print("N�meros de termos da sequ�ncia: ");
        int numTermos = input.nextInt();
        
        fibonacci(numTermos);
    }
}
