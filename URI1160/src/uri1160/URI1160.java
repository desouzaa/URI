
package uri1160;


public class URI1160 {

   
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int t, anos, pa, pb;
        double g1, g2;
                
        t = scan.nextInt();
          for(int i = 0; i <t; i++){
              pa = scan.nextInt();
              pb = scan.nextInt();
              g1 = scan.nextDouble();
              g2 = scan.nextDouble();
              anos = 0;
              
              while (pa<=pb){
                  pa += pa*g1/100;
                  pb += pb*g2/100;
                  
                  anos++;
                 if (anos>100){
                     break;
                 }
                  
              }
              if (anos>100){
                    System.out.println("Mais de 1 seculo.");
                    
          }   else      
              System.out.println(anos+" anos.");
              
          }   
    
          
          
     
          
          
          
    }
    
}
