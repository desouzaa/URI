
package uri1132;

public class URI1132 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x, y;
        x = scan.nextInt();
        y = scan.nextInt();
   
        if (x < y){
          int total1 = 0;
          for (int i = x; i <= y; i++){
              if (i % 13 != 0){
                  total1 += i;
                  
              }
          }
               System.out.println(total1);  
        }
        
        else if (x > y){
            int total2 = 0;
            for (int i = y; i <= x; i++){
                if (i % 13 !=0){
                    total2 += i;
                }
            }
               System.out.println(total2);     
        }
       
        
        
    
    }   
}
