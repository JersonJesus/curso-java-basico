/*92) Crie uma l�gica que leia um n�mero inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
par�metro � PAR ou �MPAR.*/
package exercicios;

import java.util.Scanner;

public class Exer92 {
    public static void parOuImpar(int num){
        
        if(num % 2 == 0){
            System.out.println(num + " � Par");
        } else {
            System.out.println(num + " � �mpar");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um n�mero: ");
        int num1 = input.nextInt();
        
        parOuImpar(num1);
    }
}
