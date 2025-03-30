package unidadequatro;
import java.util.Scanner;
public class Uni4Exe15 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    System.out.println("Digite a quantidade de meses de sua admissão");
    int adm = teclado.nextInt();
    if (adm < 48  && adm > 13){
      System.out.println("O funcionário irá receber 7% de reajuste");
    } else if (adm < 12){
      System.out.println("O funcionário irá receber 5% de reajuste");
    } else {
     System.out.println("Reajuste não informado");
    }
    teclado.close();
 }
}
