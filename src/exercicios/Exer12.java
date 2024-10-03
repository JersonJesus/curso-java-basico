package exercicios;
/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.*/
import java.util.Scanner;

public class Exer12 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double precoProduto,
               precoPromocional;
        
        System.out.print("Preço do Produto: ");
        precoProduto = input.nextDouble();
        
        precoPromocional = precoProduto - ((precoProduto * 5 ) / 100);
        
        System.out.println("PREÇO PROMOCIONAL (5% de desc): " + precoPromocional);
        
        input.close();
                
    }
}
