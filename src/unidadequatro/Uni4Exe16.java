package unidadequatro;

import java.util.Scanner;

public class Uni4Exe16 {

   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Informe a idade do primeiro homem");
      int h1 = teclado.nextInt();
      System.out.println("Informe a idade do segundo homem");
      int h2 = teclado.nextInt();
      System.out.println("Informe a idade da primeira mulher");
      int m1 = teclado.nextInt();
      System.out.println("Informe a idade da segunda mulher");
      int m2 = teclado.nextInt();

      if (m1 < m2 && h1 < h2) {
         int soma = m1 + h2;
         int produto = m2 * h1;
         System.out.println("Soma:" + soma + " Produto:" + produto);
      } else {
         int soma = m2 + h1;
         int produto = m1 * h2;
         System.out.println("Soma:" + soma + " Produto:" + produto);
      }
      teclado.close();
  }
}
