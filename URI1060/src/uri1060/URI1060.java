
package uri1060;

public class URI1060 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int totalpositivo;
        double x;
        totalpositivo = 0;
                
        for (int n = 0; n <6; n++) {
          x = scan.nextDouble();
           if (x > 0) {
             totalpositivo +=1;
           }  
          }
        
        System.out.println(totalpositivo + " valores positivos");
        
        
        
    }
    
}
