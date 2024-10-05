package exercicios;
/*23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
- Homens ganham 5% de desconto
- Mulheres ganham 13% de desconto*/
import java.util.Scanner;

public class Exer23 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nomeCliente;
        char sexo;
        double valorCompras,
               valorDesconto = 0; 
        
        System.out.print("Nome: ");
        nomeCliente = input.nextLine();
        
        System.out.print("Sexo: ");
        sexo = input.next().charAt(0);
        
        System.out.print("Valor Total das Compras: ");
        valorCompras = input.nextDouble();
        
        
        if (sexo == 'M' || sexo == 'm') {
            valorDesconto = valorCompras - (valorCompras * 5) / 100;
        } else if (sexo == 'F' || sexo == 'f') {
            valorDesconto = valorCompras - (valorCompras * 13) / 100;
        }
        
        System.out.println("Valor Total com Desconto: " + valorDesconto);
        
        input.close();
        
    }
}
