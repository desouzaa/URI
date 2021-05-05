package uri1019;

public class URI1019 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int N, min, hora, seg, restomin, restohora;
        N = scan.nextInt();
        
        hora = N/3600;
        restohora = N%3600;
        
        min = restohora / 60;
        restomin = restohora % 60;
       
        seg = restomin;
        System.out.printf("%d:%d:%d\n", hora, min, seg);
        
        
       
        
    }

}
