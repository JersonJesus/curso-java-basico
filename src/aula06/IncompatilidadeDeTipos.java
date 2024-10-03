package aula06;

public class IncompatilidadeDeTipos {
    
    public static void main(String[] args) {
        
        //Convertendo um inteiro em String
        int idade = 31;
        String valor = Integer.toString(idade);
        
        System.out.println("Convertendo um inteiro em String: " + valor);
        
        //Convertendo uma String em inteiro
        String idade2 = "30";
        int  valor2 = Integer.parseInt(idade2);
        
        System.out.println("Convertendo uma String em inteiro: " + idade2);
    }
    
    
    
   
            
    
            
}
