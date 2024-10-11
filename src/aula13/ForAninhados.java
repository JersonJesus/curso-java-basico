package aula13;

public class ForAninhados {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("=Tabuada de " + i + "=");
            for (int j = 1; j <= 12; j++) {
                
                System.out.println(i + " X " + j + " = " + (i*j));
                
            }
            
        }
    }
}
