package unidadequatro;
import java.util.Scanner;
public class Uni4Exe10 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      System.out.println("Informe a idade de Marquinhos");
      int a = teclado.nextInt();
      System.out.println("Informe a idade de Zezinho");
      int b = teclado.nextInt();
      System.out.println("informe a idade da Luluzinha");
      int c = teclado.nextInt();
      if  (a < b && a < c){
         System.out.println("Marquinhos é o caçula");
        } else if (b<a && b<c){
         System.out.println("Zezinho é o caçula");
        } else{
       System.out.println("Luluzinha é a caçula");
      }
   }
}
