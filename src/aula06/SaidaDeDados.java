package aula06;

public class SaidaDeDados {
    public static void main(String[] args) {
        
        //Declaração do tipo Normal
        int idadeUsuario = 3;
        double salarioUsuario = 1500.75658;
        float velocidadeMaxima = 80.50f;
        char sexoUsuario = 'M';
        boolean ehCasado = true;
        
        //Saída simples
        System.out.println("Saída Simples");
        System.out.println("Idade: " + idadeUsuario + " anos.");
        System.out.println("Salário: " + salarioUsuario + "$");
        System.out.println("Velocidade Máxima: " + velocidadeMaxima + "Km/h");
        System.out.println("Sexo: " + sexoUsuario);
        System.out.println("Casado: " + ehCasado);
        
        System.out.println("");
        
        // Especificadores de Formato
        System.out.println("Saídas usando Especificadores de Formato");
        System.out.printf("Idade: %d anos.\n", idadeUsuario);
        System.out.printf("Salário: %.2f$\n", salarioUsuario);
        System.out.printf("Velocidade Máxima: %.2f Km/h\n" , velocidadeMaxima);
        System.out.printf("Sexo: %c. \n" , sexoUsuario);
        System.out.printf("Casado: %b.", ehCasado);
        
        
        
    }
}
