package uri1049;
public class URI1049 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
       
        
        if (a.equalsIgnoreCase("vertebrado")) {
            if (b.equalsIgnoreCase("ave")){
                if(c.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
                
            }else{
               if(c.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                } 
            }
            
        } else{
            if (b.equalsIgnoreCase("inseto")){
                if(c.equalsIgnoreCase("hematofogo")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
                
            }else{
               if(c.equalsIgnoreCase("hematofogo")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                } 
            }
        }
        
        
        
        
        
        
        
        
        
    }
    
}
