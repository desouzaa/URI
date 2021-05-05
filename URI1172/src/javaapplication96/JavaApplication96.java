package javaapplication96;
public class JavaApplication96 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int[] x = new int[10];
        
        for(int i = 0; i<x.length;i++){
            int sc = scan.nextInt();
            if (sc<=0) {
             x[i] = 1;
            } else {
             x[i] = sc;   
            }
        }
        
        for(int aux = 0; aux<x.length; aux++){
            System.out.println("X["+aux+"] = " + x[aux]); 
        }
        
    }
    
}
