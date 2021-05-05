package uri1175;
public class URI1175 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int[] n = new int[20];
        
        for(int i = 0; i < n.length; i++){
            n[i] = scan.nextInt();
    }    
        
        int aux = n[0];
        n[0] = n[19];
        n[19] = aux;
        
        aux = n[1];
        n[1] = n[18];
        n[18] = aux;
        
        aux = n[2];
        n[2] = n[17];
        n[17] = aux;
        
        aux = n[3];
        n[3] = n[16];
        n[16] = aux;
        
        aux = n[4];
        n[4] = n[15];
        n[15] = aux;
        
        aux = n[5];
        n[5] = n[14];
        n[14] = aux;
        
        aux = n[6];
        n[6] = n[13];
        n[13] = aux;
        
        aux = n[7];
        n[7]= n[12];
        n[12] = aux;
        
        aux = n[8];
        n[8] = n[11];
        n[11] = aux;
        
        aux = n[9];
        n[9] = n[10];
        n[10] = aux;
        
                
        
        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "]" + " = " + n[i]);
 }
    }
}