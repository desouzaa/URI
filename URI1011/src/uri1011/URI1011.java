package uri1011;
public class URI1011 {
        public static void main(String[] args) {
          java.util.Scanner scan = new java.util.Scanner(System.in);
      
    double raio, volume;
    
    raio = scan.nextDouble();
    
    volume = (4.0/3) * 3.14159 * (raio * raio * raio);
    
            System.out.printf("VOLUME = %.3f%n", volume);
    
    }
    
}
