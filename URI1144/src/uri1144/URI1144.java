package uri1144;

public class URI1144 {
   
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n = scan.nextInt();
        if (n >= 1 && n <= 1000) {
            int a = 1, b = 1;
            for (int i = 1; i <= n; i++) {
                int c = a * b;
                System.out.println(a + " " + b + " " + c);
                System.out.println(a + " " + (++b) + " " + (c + 1));
                a++;
                b += i * 2;
            }
        }

    
 }
}