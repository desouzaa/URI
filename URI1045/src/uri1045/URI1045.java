package uri1045;

public class URI1045 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        double a, b, c, d;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        if (b > a && b > c) {
            d = a;
            a = b;
            b = d;
        } else if (c > b && c > a) {
            d = a;
            a = c;
            c = d;
        }
        if (c > b) {
            d = b;
            b = c;
            c = d;
        }

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        else{
        if ((a * a) == (b * b) + (c * c)) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if ((a * a) > (b * b) + (c * c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if ((a * a) < (b * b) + (c * c)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a==b && b==c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((a==b && b!=c) || (a!=b && b==c)){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }

  }
}