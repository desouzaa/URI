package uri1047;
public class URI1047 {
    public static void main(String[] args) {
        
       java.util.Scanner scan = new java.util.Scanner(System.in);
        
       int horaInicial = scan.nextInt();
       int minutoInicial = scan.nextInt();
      
       int horaFinal = scan.nextInt();
       int minutoFinal = scan.nextInt();
       int totHoras = horaFinal - horaInicial;
       int totMinutos = minutoFinal - minutoInicial;
        
        if (totHoras < 0){
            totHoras = 24 + (horaFinal - horaInicial);
        }
        
        if (totMinutos < 0){
            totMinutos = 60 + (minutoFinal - minutoInicial);
        
        }
        
        if (horaFinal == horaInicial && minutoFinal == minutoInicial){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if(horaFinal == horaInicial && minutoFinal < minutoInicial){
            System.out.println("O JOGO DUROU 23 HORA(S) E " + totMinutos + " MINUTO(S)");   
        }
        else{
            System.out.println("O JOGO DUROU " + totHoras + " HORA(S) E " + totMinutos + " MINUTO(S)");
        }
        
    }
    
}
