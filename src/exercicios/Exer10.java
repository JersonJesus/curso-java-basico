package exercicios;
/*10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.*/
import java.util.Scanner;

public class Exer10 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double largura,
               altura,
               area;
        
        System.out.print("Largura: ");
        largura = input.nextDouble();
        
        System.out.print("Altura: ");
        altura = input.nextDouble();
        
        area = largura * altura;
        
        System.out.printf("Área da Parede: %.2f\n", area);
        
        double litrosTinta;
        
        litrosTinta = area / 2;
        
        System.out.printf("Litros de tinta: %.2f\n", litrosTinta);
        
        input.close();
        
        
            
    }
}
