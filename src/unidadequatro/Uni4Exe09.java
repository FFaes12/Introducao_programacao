package unidadequatro;

import java.util.Scanner;

public class Uni4Exe09 {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Informe um numero inteiro");
    int a = teclado.nextInt();
    System.out.println("Informe outro numero inteiro");
    int b = teclado.nextInt();
    if (a % b == 0) {
     System.out.println("Os valores são multiplos");
    } else {
     System.out.println("Os valores não são multiplos");
    }
    teclado.close();
  }
}
