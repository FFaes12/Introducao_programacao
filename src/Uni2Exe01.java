import java.util.Scanner;                           //PROGRAMA SOMA
public class Uni2Exe01 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      System.out.println("digite um numero");     //Adquirindo os valores do usuario//
      int n1 = teclado.nextInt();
      System.out.println("Digite outro numero"); 
      int n2 = teclado.nextInt();
      int soma = (n1 + n2);                        //realizando a soma de ambos os valores//
      System.out.println("a soma de ambos os numeros resulta em "+ (soma));      
   }
}
