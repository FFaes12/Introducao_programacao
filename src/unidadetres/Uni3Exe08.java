package unidadetres;
import java.util.Scanner;
public class Uni3Exe08 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Insira um valor em dolares");
    float dol = teclado.nextFloat();
    double convers = dol * 5.65;
    System.out.printf("O atendente deve devolver R$%.2f para o cliente%n", convers);
    teclado.close();
  }
}
