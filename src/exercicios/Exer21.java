package exercicios;
/*21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO.*/
import java.util.Scanner;

public class Exer21 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int ano;
        
        System.out.print("Digite o Ano: ");
        ano = input.nextInt();
        
        if ((ano % 4 == 0 && ano % 400 == 0) || (ano % 100 != 0)) {
            System.out.println(ano + " é um Ano Bissexto");
        } else {
            System.out.println(ano + " não é um Ano Bissexto");
        }
        
        input.close();
    }
}
