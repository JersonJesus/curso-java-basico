package exercicios;
/*26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais*/

import java.util.Scanner;

public class Exer26 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o 1º valor: ");
        int num1 = input.nextInt();
        
        System.out.print("Digite o 2º valor: ");
        int num2 = input.nextInt();
        
        String conclusao;
        
        if (num1 > num2) {
            conclusao = num1 + " é maior que " + num2;
        } else if (num2 > num1){
            conclusao = num2 + " é maior que " + num1; 
        } else {
            conclusao = num1 + " é igual a " + num2;
        }
        
        System.out.println(conclusao);
        
        input.close();
    }
}
