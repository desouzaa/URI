
package uri1035;

public class URI1035 {

   
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int A, B, C, D;
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        
        if ((B > C && D > A) && (C + D > A + B) && (C > 0) && (D > 0) && (A % 2 == 0)) {
            System.out.println("Valores aceitos");
         
        } else 
            System.out.println("Valores nao aceitos");
                
        
        
    }
    
}
