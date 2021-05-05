package uri1046;
public class URI1046 {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        int horaInicial, horaFinal, totHoras;
        horaInicial = scan.nextInt();
        horaFinal = scan.nextInt();
        
        if (horaFinal < horaInicial) {
          totHoras = (24 - horaInicial) + horaFinal;  
            System.out.println("O JOGO DUROU " + totHoras + " HORA(S)");
        } else if(horaInicial == horaFinal){
           totHoras = 24; 
           System.out.println("O JOGO DUROU " + totHoras + " HORA(S)");
        } else{
           totHoras = horaFinal - horaInicial;
           System.out.println("O JOGO DUROU " + totHoras + " HORA(S)");
        }
        
        
        
        
        
    }
    
}
