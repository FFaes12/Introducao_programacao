package unidadequatro;
import java.util.Scanner;
public class Uni4Exe11 {
  public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
     System.out.println("Informe a idade do primeiro filho");
     int a = teclado.nextInt();
     System.out.println("Informe a idade do segundo filho");
     int b = teclado.nextInt();
     System.out.println("Informe a idade do terceiro filho");
     int c = teclado.nextInt();
        if (a == b && b == c){
            System.out.println("Trigemeos");
        } else if (a==b || b == c){
            System.out.println("Gemeos");
        } else {
            System.out.println("Apenas irmaos");
        }
     teclado.close();
    }
}
