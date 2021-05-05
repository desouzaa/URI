package uri1178;
public class URI1178 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double n[] = new double[100];
        
        n[0] = scan.nextDouble();
        System.out.printf("N[0] = %.4f\n", n[0]);
        for(int i = 1; i<100; i++){
        n[i] = n[i-1]/2;
            System.out.printf("N["+ i +"] = %.4f\n", n[i]);
      }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
