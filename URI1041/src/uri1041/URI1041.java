package uri1041;
public class URI1041 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        float x, y;
        x = scan.nextFloat();
        y = scan.nextFloat();
        
        if(x==0 && y==0){
            System.out.println("Origem");
        }else{
        
        if(x >= 0 && y >= 0){
            if(x==0){
                System.out.println("Eixo Y");
            }else if(y==0){
                System.out.println("Eixo X");
            }else{
                System.out.println("Q1");
            }
        }else if(x <= 0 && y >= 0){
            if(x==0){
                System.out.println("Eixo Y");
            }else if(y==0){
                System.out.println("Eixo X");
            }else{
                System.out.println("Q2");
            }
        }else if(x >= 0 && y <= 0){
            if(x==0){
                System.out.println("Eixo Y");
            }else if(y==0){
                System.out.println("Eixo X");
            }else{
                System.out.println("Q4");
            }
        }else if(x <= 0 && y <= 0){
            if(x==0){
                System.out.println("Eixo Y");
            }else if(y==0){
                System.out.println("Eixo X");
            }else{
                System.out.println("Q3");
            }    
            
        }
        }
        
        
        
        
    }
    
}
