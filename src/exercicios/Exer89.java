package exercicios;

import java.util.Scanner;

/*89) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que o programador possa escolher uma entre três bordas:
+-------=======------+ Borda 1
~~~~~~~~:::::::~~~~~~~ Borda 2
<<<<<<<<------->>>>>>> Borda 3
Ex: Uma chamada válida seria Gerador("Portugol Studio", 3, 2)
~~~~~~~~:::::::~~~~~~~
Portugol Studio
Portugol Studio
Portugol Studio
~~~~~~~~:::::::~~~~~~~*/
public class Exer89 {
   
    public static void gerador(String msg, int vezes, int numBorda){
        String tipoBorda = " ";
        
        if (numBorda == 1) {
            tipoBorda = "+-------=======------+";
        } else if(numBorda == 2){
            tipoBorda = "~~~~~~~~:::::::~~~~~~~";
        } else if(numBorda == 3){
            tipoBorda = "<<<<<<<<------->>>>>>>";
        }
        
        System.out.println(tipoBorda);
        for (int i = 1; i <= vezes; i++) {
            System.out.println(msg);
        }
        System.out.println(tipoBorda);
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite uma mensagem: ");
        String msg = input.nextLine();
        
        System.out.print("Digite o número de vezes: ");
        int vezes = input.nextInt();
        
        System.out.print("Digite o número da borda: ");
        int num = input.nextInt();
        
        gerador(msg, vezes, num);
    }
}
