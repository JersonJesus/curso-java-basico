package exercicios;
/*8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm*/
import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in, "ISO-8859-1");
        
        double distMetros;
        
        System.out.print("Digite uma distância em metros: ");
        distMetros = input.nextDouble();
        
        System.out.println("A distância de " + distMetros + "m " + "corresponde a:");
        System.out.println(distMetros / 1000 + "Km");
        System.out.println(distMetros / 100 + "Hm");
        System.out.println(distMetros / 10 + "Dam");
        System.out.println(distMetros * 10 + "dm");
        System.out.println(distMetros * 100 + "cm");
        System.out.println(distMetros * 1000 + "mm");
        
        input.close();
               
    }
}
