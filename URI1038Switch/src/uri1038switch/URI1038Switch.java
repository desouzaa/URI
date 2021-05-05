package uri1038switch;

public class URI1038Switch {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int cod, qtd;
        double val, valortot;
              
        cod = scan.nextInt();
        qtd = scan.nextInt();
        
        switch (cod){
        
            case 1: System.out.printf("Total: R$ %.2f%n", qtd * 4.00);
            break;
            case 2: System.out.printf("Total: R$ %.2f%n", qtd * 4.50);
            break;
            case 3: System.out.printf("Total: R$ %.2f%n", qtd * 5.00); 
            break;       
            case 4: System.out.printf("Total: R$ %.2f%n", qtd * 2.00);
            break;
            case 5: System.out.printf("Total: R$ %.2f%n", qtd * 1.50);
            }
     
        
        
        
        
        
        
        
    }
    
}
