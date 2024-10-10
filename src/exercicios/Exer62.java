package exercicios;
/*62) Fa�a um programa usando a estrutura ?fa�a enquanto? que leia a idade de
v�rias pessoas. A cada la�o, voc� dever� perguntar para o usu�rio se ele quer ou
n�o continuar a digitar dados. No final, quando o usu�rio decidir parar, mostre
na tela:
a) Quantas idades foram digitadas
b) Qual � a m�dia entre as idades digitadas
c) Quantas pessoas tem 21 anos ou mais.*/

import java.util.Scanner;

public class Exer62 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int idadeUsuario,
            c = 0;
        char respostaUsuario = ' ';
        boolean continuar = true;
        
        int idadesDigitadas = 0,
            somaIdades = 0,
            idadeAcima21 = 0;
        
        do {            
            System.out.println("=====" + (c+1) + "� Pessoa=====");
            
            System.out.print("Idade: ");
            idadeUsuario = input.nextInt();
            
            if (idadeUsuario >= 21) {
                idadeAcima21++;
            }
            
            somaIdades+=idadeUsuario;
            
            idadesDigitadas++;
            
            System.out.print("Quer continuar? [S/N]: ");
            respostaUsuario = input.next().charAt(0);
            
            if (respostaUsuario == 'N' || respostaUsuario == 'n') {
                continuar = false;
            }
            
            c++;
        } while (continuar);
        
        System.out.println("Idades Digitadas: " + idadesDigitadas);
        System.out.println("M�dia de idades Digitadas: " + (double)somaIdades / c);
        System.out.println("Pessoas que tem 21 anos ou mais: " + idadeAcima21);
        
    }
}
