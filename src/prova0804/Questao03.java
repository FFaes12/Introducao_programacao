package prova0804;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva seu tipo sanguíneo");
        System.out.println("Tipos permitidosA: A,B,O");
        
        char tipo = teclado.next().charAt(0);
        tipo = Character.toUpperCase(tipo);

        if (tipo == 'A') {
            System.out.println("Azul");
        } else if (tipo == 'B') {
            System.out.println("Vermelha");
        } else if (tipo == 'O') {
            System.out.println("Universal");
        } else {
            System.out.println("Tipo incorreto");
        }

        teclado.close();
    }
}
