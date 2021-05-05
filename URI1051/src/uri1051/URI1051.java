
package uri1051;

public class URI1051 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double s, i;
        s = scan.nextDouble();
        
        if (s <= 2000) {
            System.out.println("Isento");
        }    else if (s > 2000 && s <= 3000){
            i = (s - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", i);
        }   else if (s > 3000 && s < 4500){
            i = ((s - 3000) * 0.18) + 80;
            System.out.printf("R$ %.2f%n", i);
        }   else if (s >= 4500) {
            i = ((s - 4500) * 0.28 + 350);
            System.out.printf("R$ %.2f%n", i);
        }
              
        
        
        
        
    }
    
}
