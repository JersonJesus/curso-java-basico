package aula10;

import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int numPernas;
        String designacao;
        
        System.out.println("Digite o número de pernas");
        numPernas = input.nextInt();
        
        switch(numPernas){
            
            case 1: 
                designacao = "Saci";
            break;
            
            case 2: 
                designacao = "Bípede";
            break;
            
            case 4: 
                designacao = "Quadrípede";
            break;
            
            case 8: 
                designacao = "Aranha";
            break;
            
            default:
                designacao = "ET";
            
        }
        System.out.println("Designação: " + designacao);
    }
}
