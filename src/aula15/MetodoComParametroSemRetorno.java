package aula15;

import java.util.Scanner;

public class MetodoComParametroSemRetorno {
    //M�todo
    static void soma(int num1, int num2){
        int soma = num1 + num2;
        
        System.out.println(num1 + " + " + num2 + " = " + soma);
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1� Valor: ");
        int num1 = input.nextInt();
        
        System.out.print("2� Valor: ");
        int num2 = input.nextInt();
        
        soma(num1,num2);
    }
}
