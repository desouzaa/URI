package uri1066;

public class URI1066 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int n, par, impar, positivo, negativo;
        n = 0;
        par = 0;
        impar = 0;
        positivo = 0;
        negativo = 0;
             
        for (int i = 0; i<5; i++) {
            n = scan.nextInt();
            if (n%2==0) 
                par +=1;                                
            
            else
                impar +=1;
            
            if (n>0)
                positivo +=1;
            
            else if (n<0) 
                negativo +=1;
            }
            
            System.out.println(par +" valor(es) par(es)");
            System.out.println(impar +" valor(es) impar(es)");     
            System.out.println(positivo +" valor(es) positivo(s)");
            System.out.println(negativo +" valor(es) negativo(s)");
        
    }

}
