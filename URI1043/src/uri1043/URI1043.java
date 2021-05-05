package uri1043;
public class URI1043 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        float a, b, c;
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        
      boolean teste1 = ((Math.abs(b-c) < a)&&(a < b + c));
      boolean teste2 = ((Math.abs(a-c) < b)&&(b < a + c));
      boolean teste3 = ((Math.abs(a-b) < c)&&(c < a + b));
               
       if(teste1==true && teste2==true && teste3==true){
         float perimetro = a + b + c;
           System.out.printf("Perimetro = %.1f%n", perimetro);
       }else{
          float area = ((a + b) * c) / 2; 
           System.out.printf("Area = %.1f%n", area);
       }
        
        
        
        
    }
    
}
