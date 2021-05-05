
package uri1038;

public class URI1038 {

    
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int cod, qtd;
        double val, valortot;
              
        cod = scan.nextInt();
        qtd = scan.nextInt();
        
        if (cod == 1) {
            System.out.printf("Total: R$ %.2f%n", qtd * 4.00);
         }else
            if (cod ==2){
            System.out.printf("Total: R$ %.2f%n", qtd * 4.50);
               }else
                if (cod==3){
                  System.out.printf("Total: R$ %.2f%n", qtd * 5.00); 
                      }else 
                         if (cod==4){
                          System.out.printf("Total: R$ %.2f%n", qtd * 2.00);
                             }else 
                                if (cod==5){
                                 System.out.printf("Total: R$ %.2f%n", qtd * 1.50);
                             }
     
        
        
        
        
        
        
        
        
    }
    
}
