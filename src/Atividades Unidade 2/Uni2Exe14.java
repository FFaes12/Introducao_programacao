import java.util.Scanner;

public class Uni2Exe14 {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Digite o valor em reais: ");
      int valor = scanner.nextInt();
      int[] notas = {100, 50, 20, 10, 5, 2, 1};
      for (int nota : notas) {
      int quantidade = valor / nota; 
      if (quantidade > 0) {
      System.out.println(quantidade + " nota de  " + nota + " reais ");
      valor %= nota; 
      }
      }

      scanner.close();
   }
}