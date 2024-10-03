package exercicios;
/*16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.*/
import java.util.Scanner;

public class Exer16 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int cigarrosDia,
            anosFumando;
        
        System.out.print("Cigarros por Dia: ");
        cigarrosDia = input.nextInt();
        
        System.out.print("Anos Fumando: ");
        anosFumando = input.nextInt();
        
        int minFumando = (cigarrosDia * 10) * (anosFumando * 365);
        
        double diasVida = (double)minFumando / 1440;
        
        System.out.println("Você perdeu " + diasVida + " dias de vida.");
        
        input.close();
        
    }
}
