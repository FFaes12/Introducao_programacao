package unidadecinco;

import java.util.Scanner;



public class Uni5Exe09 {
  public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      System.out.println("Quantas entradas você ira digitar?");
      int n = teclado.nextInt();
      teclado.nextLine();

      for (int cont = 1; cont <= n; cont ++){
           System.out.println("Digite o nome do aluno");
           String aluno = teclado.nextLine();
          
        }   
    }
}
