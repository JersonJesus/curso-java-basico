package aula08;

public class OperadoresLogicos {
    
    public static void main(String[] args) {
        
        int num1 = 4,
            num2 = 7,
            num3 = 12;
        
        boolean resusltado;
        
        resusltado = ((num1 > num2) && (num3 != num1)) ? true : false;
        System.out.println("(" + num1 + " > " + num2 + ") && (" + num3 + " != " + num1 + ") = " + resusltado);
        
        resusltado = ((num1 < num2) || (num3 <= num1)) ? true : false;
        System.out.println("(" + num1 + " < " + num2 + ") || (" + num3 + " <= " + num1 + ") = " + resusltado);
        
        resusltado = ((num1 <= num2) ^ (num3 == num1)) ? true : false;
        System.out.println("(" + num1 + " <= " + num2 + ") ^ (" + num3 + " == " + num1 + ") = " + resusltado);
        
        resusltado = (!(num1 > num2) ) ? true : false;
        System.out.println("!(" + num1 + " > " + num2 + ") = " + resusltado);
    }
}
