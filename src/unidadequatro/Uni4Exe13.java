package unidadequatro;

import java.util.Scanner;

public class Uni4Exe13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe as 3 cartas");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int qtcartasboas = 0;

        if (a == 1 || a == 2 || a == 3) {
            qtcartasboas += 1;
        } if (b == 1 || b == 2 || b == 3) {
            qtcartasboas++;
        }  if (c == 1 || c == 2 || c == 3) {
            qtcartasboas++;
        }  if (qtcartasboas == 1) {
            System.out.println("TRUCO!");
        }  else if (qtcartasboas == 2) {
            System.out.println("SEIS PAPUDO!");
        }  else if (qtcartasboas == 3) {
            System.out.println("NOVEEE!");
        }
        teclado.close();
    }
}
