
package uri1117;

public class URI1117 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double n1, n2, media;
        n1 = scan.nextDouble();
        
         while (n1<0 || n1>10) {
             System.out.println("nota invalida");
             n1 = scan.nextDouble();                         
         }
         n2 = scan.nextDouble();
         while (n2<0 || n2>10) {
             System.out.println("nota invalida");
             n2 = scan.nextDouble();
         }
         media = (n1+n2)/2;
         System.out.println("media = " + media);
         
        
        
    }
    
}
