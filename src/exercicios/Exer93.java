/*93) Fa�a um programa que tenha um procedimento chamado Contador() que recebe
tr�s valores como par�metro: o in�cio, o fim e o incremento de uma contagem. O
programa principal deve solicitar a digita��o desses valores e pass�-los ao
procedimento, que vai mostrar a contagem na tela.

Ex: Para os valores de in�cio (4), fim (20) e incremento(3) teremos
Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM*/
package exercicios;

import java.util.Scanner;

public class Exer93 {
    
    static void contador(int ini, int fim, int inc){
        for (int i = ini; i <= fim; i+=inc) {
            System.out.print(i + " >> ");
        }
        System.out.println("FIM");
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o Inicio: ");
        int inicio = input.nextInt();
        
        System.out.print("Digite o Fim: ");
        int fim = input.nextInt();
        
        System.out.print("Digite o Incremento: ");
        int incremento = input.nextInt();
        
        contador(inicio, fim, incremento);
    }
}
