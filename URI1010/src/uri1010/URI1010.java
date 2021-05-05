package uri1010;
public class URI1010 {

    public static void main(String[] args) {
      
         java.util.Scanner scan = new java.util.Scanner(System.in);
      
     int cod1, cod2, qtd1, qtd2;
     double vlr1, vlr2, total;
     
     cod1 = scan.nextInt();
     qtd1 = scan.nextInt();
     vlr1 = scan.nextDouble();
     cod2 = scan.nextInt();  
     qtd2 = scan.nextInt(); 
     vlr2 = scan.nextDouble();
        
     total = qtd1 * vlr1 + qtd2 * vlr2;
     
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
     
    }
    
}
