package uri1006;

public class URI1006 {

    public static void main(String[] args) {

        java.util.Scanner scan = new java.util.Scanner(System.in);

        double A, B, C, MEDIA;

        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        MEDIA = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }

}
