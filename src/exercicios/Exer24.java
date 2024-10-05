package exercicios;
/*24) Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.*/
import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double distancia,
               precoPassagem = 0;
        
        System.out.print("Distância (Km): ");
        distancia = input.nextDouble();
        
        if (distancia <= 200) {
            precoPassagem = distancia * 0.20;
        } else {
            precoPassagem = distancia * 0.45;
        }
        
        System.out.println("Preço da Passagem: "  + precoPassagem);
        
        
    }
}
