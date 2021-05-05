package uri1040;

public class URI1040 {
    public static void main(String[] args) {
        
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        float n1 = scan.nextFloat();
        float n2 = scan.nextFloat();
        float n3 = scan.nextFloat();
        float n4 = scan.nextFloat();
        
        
        double media = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10;
        
        System.out.printf("Media: %.1f%n", media);
        
        if(media >= 7) {
            
            System.out.println("Aluno aprovado.");
            
        }if(media < 5){
            
            System.out.println("Aluno reprovado.");
            
        } else if(media >= 5 && media <= 6.9){
            float n5;
            System.out.println("Aluno em exame.");
            n5 = scan.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", n5);
            double mediaFinal = (n5 + media) / 2;
            
            if(mediaFinal >= 5){
                
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", mediaFinal);
                
            }else{
                
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f&n", mediaFinal);
                
            }
        }
        
        
        
        
        
    }
    
}
