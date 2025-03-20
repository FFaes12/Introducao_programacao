package unidadetres;
import java.util.Scanner;
public class Uni3Exe15 {
   public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      System.out.println("Insira um numero inteiro de até 3 digitos");
      int numr = teclado.nextInt();
      if (numr>999) {
      System.out.println("Só até 3 digitos, leia o enunciado com atenção!");
      return;
      }
      int centenas = numr / 100;
      int dezenas = (numr % 100) / 10;
      int unidades = numr % 10;
      System.out.printf("%d centena(s) %d dezena(s) %d unidade(s)", centenas,dezenas,unidades);
      teclado.close();
   }
}
