package aula08;

public class ComparacaoString {
    
    public static void main(String[] args) {
        
        String nome1 = "Jerson",
               nome2 = "Jerson",
               nome3 = new String("Jerson");
        
        String resultado;
        
        
        resultado = (nome1.equals(nome3)) ? "Igual" : "Diferente";
        
        System.out.println(resultado);
        
        //Quando se comparam Strings entre si, usasse o método .equals()
        
    }
}
