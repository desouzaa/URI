package uri1040_segundojeito;

import java.util.Scanner;

public class URI1040_SegundoJeito {
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
        
        float[] n = new float[5];
        n[0] = scan.nextFloat();
        n[1] = scan.nextFloat();
        n[2] = scan.nextFloat();
        n[3] = scan.nextFloat();
        
        double media = ((n[0]*2) + (n[1]*3) + (n[2]*4) + (n[3]*1)) / 10;
        
        System.out.printf("Media: %.1f%n", media);
        
        if(media >= 7) {
            
            System.out.println("Aluno aprovado.");
            
        }if(media < 5){
            
            System.out.println("Aluno reprovado.");
            
        } else if(media >= 5 && media <= 6.9){
            
            System.out.println("Aluno em exame.");
            n[4] = scan.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", n[4]);
            double mediaFinal = (n[4] + media) / 2;
            
            if(mediaFinal >= 5){
                
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", mediaFinal);
                
            }else{
                
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", mediaFinal);
                
            }
        }  
       
     
    }
    
}
