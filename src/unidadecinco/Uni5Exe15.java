package unidadecinco;

import java.util.Scanner;

public class Uni5Exe15 {
  public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      String nome = "";
      while (nome.equals("fim")){
          System.out.println("Entre com o nome do aluno('fim' para finalizar): ");
          nome = teclado.nextLine().toLowerCase();
          System.out.println("Entre com a nota 1: ");
          double nota1 = teclado.nextDouble();
          System.out.println("Entre com a nota 2: ");
          double nota2 = teclado.nextDouble();
          double media = (nota1 + nota2) / 2;
          System.out.println("A média do(a) " + nome + " é " + media);
        }
        teclado.close();
   }
}
