
package exercicios;
/*63) Crie um programa usando a estrutura ?fa�a enquanto? que leia v�rios n�meros.
A cada la�o, pergunte se o usu�rio quer continuar ou n�o. No final, mostre na
tela:
a) O somat�rio entre todos os valores
b) Qual foi o menor valor digitado
c) A m�dia entre todos os valores
d) Quantos valores s�o pares*/

import java.util.Scanner;

public class Exer63 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num,
            c = 0;
        char respostaUsuario = ' ';
        boolean continuar = true;
        
        int somaNumeros = 0,
            menorValor = Integer.MAX_VALUE,
            valoresPares = 0;
        
        do {            
            System.out.print((c+1) + "� Valor: ");
            num = input.nextInt();
            
            somaNumeros += num;
            
            if (num < menorValor) {
                menorValor = num;
            }
            
            if (num % 2 == 0) {
                valoresPares++;
            }
            
            System.out.print("Quer continuar? [S/N]: ");
            respostaUsuario = input.next().charAt(0);
            
            if (respostaUsuario == 'N' || respostaUsuario == 'n') {
                continuar = false;
            }
            
            c++;      
        } while (continuar);
        System.out.println("O somat�rio entre todos os valores: " + somaNumeros);
        System.out.println("Menor valor digitado: " + menorValor);
        System.out.println("M�dia entre todos os valores: " + (double)somaNumeros / c);
        System.out.println("Valores pares: " + valoresPares);
    }
}
