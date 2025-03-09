import java.util.Scanner;
public class Uni2Exe08 {
   public static void main(String[] args) {
      java.util.Scanner teclado = new Scanner (System.in);
      System.out.println("Digite o numero da peça desejada");
      int n1 = teclado.nextInt();
      System.out.println("Digite o numero de peças desejadas");
      int n2 = teclado.nextInt();                                                          //compra de duas peças e relação preço/quantidade
      System.out.println("Qual o preço dessa peça?");
      float p1 = teclado.nextFloat();
      System.out.println("Digite o numero da segunda peça desejada");
      int n3 = teclado.nextInt();
      System.out.println("Digite o numero de peças desejadas");
      int n4 = teclado.nextInt();
      System.out.println("Qual o preço dessa peça?");
      float p2 = teclado.nextFloat();
      double preco = n2 * p1 + n4 * p2;
      System.out.println("Na compra de " + n2 + " peças de numero "+ n1 + " e mais "+ n4 + " peças de numero "+ n3 + " é necessario o pagamento de "+ preco + " reais");
      teclado.close();
   }
}              
