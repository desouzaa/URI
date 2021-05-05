package uri1036;

public class URI1036 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double A, B, C, DELTA, X1, X2;
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        
        DELTA = (B * B) - (4 * A * C);
                
        if (DELTA <0 || A==0) {
            System.out.println("Impossivel calcular");
            
        } else {
            X1 = (-B + Math.sqrt(DELTA)) / (2*A);  
            X2 = (-B - Math.sqrt(DELTA)) / (2*A);
            
            System.out.printf("R1 = %.5f%n", X1);
            System.out.printf("R2 = %.5f%n", X2);
        }
            
             
    
        
        
    }
    
}
