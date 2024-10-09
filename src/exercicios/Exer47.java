package exercicios;
/*47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
450 + 400 + 350 + 300 + ... + 50 + 0*/
public class Exer47 {
    
    public static void main(String[] args) {
        
         int c = 500,
            soma = 0;
        
        while (c >= 0) {            
            if (c != 0) {
                System.out.print(c + " + ");
            } else {
                System.out.print(c + " = ");
            }
            
            soma += c; 
            c -= 50;
            
            
        }
        System.out.println(soma);
    }
}
