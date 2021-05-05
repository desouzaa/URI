package uri1048;

import java.util.Scanner;

public class URI1048 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float salario = scan.nextFloat();
        float reajuste;
        int percentual;

        if (salario >= 0 && salario <= 400) {
            percentual = 15;
            reajuste = (salario * 0.15f);
        } else if (salario > 400 && salario <= 800) {
            percentual = 12;
            reajuste = (salario * 0.12f);
        } else if (salario > 800 && salario <= 1200) {
           percentual = 10;
            reajuste = (salario * 0.10f);
        } else if (salario > 1200 && salario <= 2000) {
            percentual = 7;
            reajuste = (salario * 0.07f);
        } else {
           percentual = 4;
            reajuste = (salario * 0.04f);
        }

        System.out.printf("Novo salario: %.2f%n", (salario + reajuste));
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

    }

}
