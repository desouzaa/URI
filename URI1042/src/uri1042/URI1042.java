
package uri1042;

public class URI1042 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x, y, z, a, g1, g2, g3;
        
        x = scan.nextInt();
        y = scan.nextInt();    
        z = scan.nextInt();
        
        g1 = x;
        g2 = y;
        g3 = z;
                
        
        if (y < x && y < z) {
            a = x;
            x = y;
            y = a;
    }       if (z < x && z < y) {
                a = x;
                x = z;
                z = a;}
                if (y > z){
                    a = y;
                    y = z;
                    z = a;
                }
                  
       
         
        
    System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(" ");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        
        
        
        
    }
    
}
