package exercicios;

import java.util.Scanner;

/*51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
! qual foi o maior e qual foi o menor preço digitados.*/
public class Exer51 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double precoProduto;
        int c = 1;
        
        double maiorPreco = Double.MIN_VALUE,
               menorPreco = Double.MAX_VALUE;
        
        while (c <= 8) {            
            System.out.print(c + "º Produto: ");
            precoProduto = input.nextDouble();
            
            if (precoProduto > maiorPreco) {
                maiorPreco = precoProduto;
            }
            
            if (precoProduto < menorPreco) {
                menorPreco = precoProduto;
            }
            
            c++;
        }
        System.out.println("Maior Preço: " + maiorPreco);
        System.out.println("Menor Preço: " + menorPreco);
        
        input.close();
    }
}
