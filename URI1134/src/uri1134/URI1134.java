
package uri1134;

public class URI1134 {

    
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x, alcool, gasolina, diesel;
        
        x = 0;          
        alcool = 0;
        gasolina = 0;
        diesel = 0;
               
        while (x != 4) {
            
            x = scan.nextInt();
            
             switch (x) {
                 case 1: alcool ++;
                 break;
                 case 2: gasolina ++;
                 break;
                 case 3: diesel ++;
                 break;             
            }  
        }
               
                        
               System.out.println("MUITO OBRIGADO");
               System.out.println("Alcool: " + alcool);
               System.out.println("Gasolina: " + gasolina);
               System.out.println("Diesel: " + diesel);
           
        }
        
        
        
           
           
           
        
        
    
    
}
