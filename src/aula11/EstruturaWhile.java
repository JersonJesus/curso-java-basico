package aula11;

public class EstruturaWhile {
 
    public static void main(String[] args) {
        
        int c = 0;
        
        while (c < 20) {  
            
            c++;
            
            if (c == 5 || c == 10) {
                continue;
            } else if(c == 15) {
                break;
            }
            
            System.out.println(c + "º Cambalhota");
            
            
        }
    }
}
