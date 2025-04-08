package prova0804;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float altura = teclado.nextFloat();
        float peso = teclado.nextFloat();

        if (altura > 1.00 && peso > 50) {
            if (altura > 5.00 || peso > 300) {
                System.out.println("Pegar medidas novamente");
            } else {
                System.out.println("normal");
            }
        } else {
            System.out.println("Subnutrido");
            System.out.println("Perigo de vida");
        }
        System.out.println("fim");
        teclado.close();
    }
}
