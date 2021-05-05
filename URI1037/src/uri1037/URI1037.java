package uri1037;

public class URI1037 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double x;
        x = scan.nextDouble();
        
        if (x >= 0 && x <= 25) {
            System.out.println("Intervalo [0,25]");
        } else 
            if ((x > 25) && (x<=50)) {
            System.out.println("Intervalo (25,50]");
            
          } else 
                if ((x>50) && (x <=75)) {
                    System.out.println("Intervalo (50,75]");    
             
            }   else
                    if ((x>75) && (x<=100)) {
                        System.out.println("Intervalo (75,100]");
                }
        
        else
            System.out.println("Fora de intervalo");             
          
            
        
           
        
       
        
        
        
        
        
        
        
    }

}
