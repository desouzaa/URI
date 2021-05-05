
package uri1080;

public class URI1080 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n, maior, posicao;
    
        maior = 0;
        posicao = 0;
        
    for (int i=1; i<=100; i++) {
        n = scan.nextInt();
        if (n>maior) {
            maior = n;
            posicao = i;
        }      
    }    
        System.out.println(maior);
        System.out.println(posicao);
        
   
        
    }
    
}
