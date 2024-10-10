package exercicios;
/*59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens*/
import java.util.Scanner;

public class Exer59 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int idadeUsuario,
            c = 0,
            maiorIdade = Integer.MIN_VALUE,
            homensCadastrados = 0,
            idadeMulherJovem = Integer.MAX_VALUE,
            somaIdadeHomens = 0;
        
        char sexoUsuario,
             respostaUsuario;
        
        boolean encerrar = false;
        
        while (!encerrar) {
            
            System.out.println("=====" + (c + 1) + "º Pessoa=====");

            System.out.print("Idade: ");
            idadeUsuario = input.nextInt();
            
            System.out.print("Sexo [M/F]: ");
            sexoUsuario = input.next().charAt(0);
            
            System.out.print("Deseja cadastrar outra pessoa? [S/N]: ");
            respostaUsuario = input.next().charAt(0);
            
            if (idadeUsuario > maiorIdade) {
                maiorIdade = idadeUsuario;
            }

            if (sexoUsuario == 'm' || sexoUsuario == 'M') {
                homensCadastrados++;
                somaIdadeHomens+=idadeUsuario;
                
            } else if(sexoUsuario == 'f' || sexoUsuario == 'F') {
                
               if(idadeUsuario < idadeMulherJovem){
                   idadeMulherJovem = idadeUsuario;
                }
            }
            c++;
            
            if (respostaUsuario == 'n' || respostaUsuario == 'N') {
                encerrar = true;    
            }     
        }
        System.out.println("Maior idade lida: " + maiorIdade);
        System.out.println("Quantos homens foram cadastrados: " + homensCadastrados);
        System.out.println("Idade da mulher mais jovem: " + idadeMulherJovem);
        System.out.println("Média de idade entre os homens: " + (double)somaIdadeHomens / homensCadastrados);
    }
}
