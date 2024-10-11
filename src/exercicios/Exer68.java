package exercicios;
/*68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
?para?. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens*/

import java.util.*;
public class Exer68 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String sexoUsuario;
        double pesoUsuario;
        
        boolean sexoValido = false,
                pesoValido = false;
        
        int numMulheres = 0,
            numHomens = 0,
            homensAcima100 = 0;
        
        double somaPesoMulheres = 0,
               maiorPesoHomens = Integer.MIN_VALUE;
        
        for (int i = 1; i <= 4; i++) {
            System.out.println("===" + i + "ª Pessoa===");
            
            do {                
                System.out.print("Peso: ");
                pesoUsuario = input.nextDouble();
                
                if (pesoUsuario >= 10 && pesoUsuario <= 150) {
                    pesoValido = true;
                } else {
                    System.out.println("Peso Inválido. Escolha entre 10kg e 150kg");
                }
            } while (!pesoValido);
            
            do {                
                System.out.print("Sexo [M/F]: ");
                sexoUsuario = input.next();
                
                if (sexoUsuario.equalsIgnoreCase("M") || sexoUsuario.equalsIgnoreCase("F")){
                    sexoValido = true;  
                } else {
                    System.out.println("Sexo Inválido. Tente as opções acima. ");  
                    sexoValido = false;
                }
            } while (!sexoValido);
            
            
            
            if (sexoUsuario.equalsIgnoreCase("M")) {
                numHomens++;
                
                if (pesoUsuario > 100) {
                    homensAcima100++;
                }
                
                if (pesoUsuario > maiorPesoHomens) {
                    maiorPesoHomens = pesoUsuario;
                }
            } else if (sexoUsuario.equalsIgnoreCase("F")){
                numMulheres++;
                somaPesoMulheres += pesoUsuario;
                
            }
        }
        System.out.println("Mulheres cadastradas: " + numMulheres);
        System.out.println("Homens acima dos 100Kg: " + homensAcima100);
        System.out.println("Média de peso entre as mulheres: " + somaPesoMulheres / numMulheres);
        System.out.println("Maior peso entre os homens: " + maiorPesoHomens);
        
        input.close();
        
    }
            
}
