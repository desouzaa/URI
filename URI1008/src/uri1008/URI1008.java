package uri1008;
public class URI1008 {
    public static void main(String[] args) {
     
       java.util.Scanner scan = new java.util.Scanner(System.in);
      
      int number, time;
      double salary, valor;
      
      number = scan.nextInt();
      time = scan.nextInt();
      valor = scan.nextDouble();
      salary = time * valor;
      
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
      
      
      
        
        
        
    }
    
}
