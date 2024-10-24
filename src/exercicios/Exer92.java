/*92) Crie uma lógica que leia um número inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
parâmetro é PAR ou ÍMPAR.*/
package exercicios;

import java.util.Scanner;

public class Exer92 {
    public static void parOuImpar(int num){
        
        if(num % 2 == 0){
            System.out.println(num + " é Par");
        } else {
            System.out.println(num + " é Ímpar");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num1 = input.nextInt();
        
        parOuImpar(num1);
    }
}
