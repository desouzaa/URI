package uri1020;
public class URI1020 {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int idadeDias, restoDia, idadeAnos, restoAno, idadeMeses; 
        idadeDias = scan.nextInt();
        
        idadeAnos = idadeDias/365;
        restoAno = idadeDias%365;
        
        idadeMeses = restoAno/30;
        restoDia = restoAno%30;
              
        
        System.out.println(idadeAnos + " ano(s)");
        System.out.println(idadeMeses + " mes(es)");
        System.out.println(restoDia + " dia(s)");
        
    }
    
}
