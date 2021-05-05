
package uri1018;
import java.util.Scanner;

public class URI1018 {

    public static void main(String[] args) {
    java.util.Scanner scan = new java.util.Scanner(System.in);
    
    int nota100, nota50, nota20, nota10, nota5, nota2, nota1;
    int valorEntrada, valor;
    
    valorEntrada = scan.nextInt();
    valor = valorEntrada;
    
    nota100 = valor/100;
    valor -= nota100 * 100;
    nota50 = valor/50;
    valor -= nota50 * 50;
    nota20 = valor/20;
    valor -= nota20 * 20;
    nota10 = valor/10;
    valor -= nota10 * 10;
    nota5 = valor/5;
    valor -= nota5 * 5;
    nota2 = valor/2;
    valor -= nota2 * 2;
    nota1 = valor/1;
    valor -= nota1 * 1;
    
        System.out.println(valorEntrada);
        System.out.println(nota100 + " nota(s) de R$ 100,00");
        System.out.println(nota50 + " nota(s) de R$ 50,00");
        System.out.println(nota20 + " nota(s) de R$ 20,00");
        System.out.println(nota10 + " nota(s) de R$ 10,00");
        System.out.println(nota5 + " nota(s) de R$ 5,00");
        System.out.println(nota2 + " nota(s) de R$ 2,00");
        System.out.println(nota1 + " nota(s) de R$ 1,00");
    }
    
}
