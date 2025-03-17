package unidadetres;
import java.util.Scanner;

public class Uni3Exe16 {
   public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       System.out.println("Digite o valor total da compra");
       int valorcompra = teclado.nextInt();
       System.out.println("Qual foi o valor dado pelo cliente");
       int valorcliente = teclado.nextInt();
       int troco = valorcliente - valorcompra;
       if (troco < 0) {
        System.out.println("valor invalido");
        return;
       }
       int notcem = troco / 100;
       troco %= 100;
       int notdez = troco / 10;
       troco %= 10;
       int notuni = troco;

       int totaldenotas = notcem + notdez + notuni;

       System.out.println("O número mínimo de notas de troco é: " + totaldenotas);
        System.out.println("Quantidade de notas de 100 necessárias é: " + notcem);
        System.out.println("Quantidade de notas de 10 necessárias é: " + notdez);
        System.out.println("Quantidade de notas de 1 necessárias é: " + notuni);
        
        teclado.close();
    }
}
