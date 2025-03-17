package atividadesunidade2;
import java.util.Scanner;
public class Uni2Exe04 {                                          //calculo da media com pesos diferentes e     //
   public static void main(String[] args) {                      //    limite de nota//
      Scanner teclado = new Scanner (System.in);

                                                            
      System.out.println("digite a nota de sua avaliação A ");
      float na = teclado.nextFloat();
      System.out.println("digite a nota de sua avaliação B ");
      float nb = teclado.nextFloat();
      double calculomedia = nb * 0.75 + na * 0.35;
      if (calculomedia>10) {
      System.out.println("a sua nota é 10");
      }  else {
      System.out.println("a sua nota é "+ (calculomedia));
      }
      teclado.close();
   }
}
