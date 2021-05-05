package uri1009;
public class URI1009 {
    public static void main(String[] args) {
        
         java.util.Scanner scan = new java.util.Scanner(System.in);
      
      String nome;
      double fixo, totvenda, salario;
      
      nome = scan.nextLine();
      fixo = scan.nextDouble();
      totvenda = scan.nextDouble();
      
      salario = fixo + (totvenda * 0.15);
            
        System.out.printf("TOTAL = R$ %.2f%n", salario);
       
        
    }
    
}
