package uni4exexbeecrowd;

import java.util.Scanner;

public class SelectionTest2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float a = teclado.nextFloat();
        if (a <= 25 && a >= 0) {
            System.out.println("Intervalo [0,25]");
        } else if (a <= 50 && a >= 25) {
            System.out.println("Intervalo (25,50]");
        } else if (a <= 75 && a >= 50) {
            System.out.println("Intervalo [50,75]");
        } else if (a <= 100 && a >= 75) {
            System.out.println("Intervalo (75,100]");
        } else if (a < 0 || a > 100) {
            System.out.println("Fora de intervalo");
        }
        teclado.close();

    }
}
