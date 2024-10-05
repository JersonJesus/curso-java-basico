package exercicios;
/*22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.*/
import java.time.LocalDate;
import java.util.Scanner;

public class Exer22 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int anoNascimento,
            anoAtual = LocalDate.now().getYear(),
            idadeAtual;
        
        System.out.print("Ano de Nascimento: ");
        anoNascimento = input.nextInt();
        
        idadeAtual = anoAtual - anoNascimento;
        System.out.println("Idade Atual: " + idadeAtual + " anos.");
        
        if (idadeAtual < 18) {
            System.out.println("Faltam " + (18 - idadeAtual) + " anos para o alistamento");
        } else {
            System.out.println("Já se passaram " + (idadeAtual - 18) + " anos para o alistamento");
        }
        
        input.close();
    }
}
