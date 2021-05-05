package uri1173;
public class URI1173 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int[] n = new int[10];
        int x1 = scan.nextInt();
        n[0] = x1;
        
        for(int i = 1; i< n.length; i++){
            n[i] = n[i-1] * 2;
        }
        
        System.out.println("N[0] = " + n[0]);
        for(int aux = 1; aux< n.length; aux++){
            System.out.println("N[" + aux + "] = " + n[aux]);
        }
        
        
        
        
        
    }
    
}
