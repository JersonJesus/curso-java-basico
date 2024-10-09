package exercicios;
/*54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.*/
import java.util.Scanner;

public class Exer54 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double pesoUsuario = 0,
               alturaUsuario = 0,
               somaAltura = 0;
        
        int c = 0,
            pesoAcima90 = 0,
            pesoMenos50 = 0,
            pesoAcima100 = 0;
        
        while (c < 4) {            
            System.out.println("=====" + (c + 1) + "ª Pessoa =====");
            
            System.out.print("Peso: ");
            pesoUsuario = input.nextDouble();
            
            if (pesoUsuario > 90) {
                pesoAcima90++;
            }
           
            System.out.print("Altura: ");
            alturaUsuario = input.nextDouble();
            
            somaAltura+=alturaUsuario;
            
            if (pesoUsuario < 50 && alturaUsuario < 1.60) {
                pesoMenos50++;
            }
            
            if (pesoUsuario > 100 && alturaUsuario > 1.90) {
                pesoAcima90++;
            }
            
            c++;
        }
        System.out.println("========== RESULTADO ==========");
        System.out.printf("Média de altura do grupo: %.2f.\n", ((double)somaAltura / c));
        System.out.println("Pessoas que pesam mais de 90Kg: " + pesoAcima90);
        System.out.println("Pessoas que pesam menos de 50Kg tem menos de 1.60m: " + pesoMenos50);
        System.out.println("Pessoas que medem mais de 1.90m pesam mais de 100Kg: " + pesoAcima90);
        
        input.close();
        
        
    }
}
