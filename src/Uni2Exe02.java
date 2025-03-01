import java.util.Scanner;
public class Uni2Exe02 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);                    //multiplicação de valores//
      
      System.out.println("digite o primeiro valor");             //obtenção dos valores//
      int n1 = teclado.nextInt();
      System.out.println("digite o segundo valor");
      int n2 = teclado.nextInt();
      int multiplicacao = (n1 * n2);                              //realizando a multiplicacao//
      System.out.println("a multiplicação de ambos os valores resulta em "+ multiplicacao);
      teclado.close();
  } 
}
    