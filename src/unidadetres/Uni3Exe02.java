package unidadetres;
import java.util.Scanner;
public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o preço do par de sapatos desejados");
        int p = teclado.nextInt();
        double desconto = p - (p*0.12);
        double valordesconto = p * 0.12;
        System.out.println("O valor do desconto é de "+ valordesconto + " o preço do par de sapatos com desconto é "+ desconto);
        teclado.close();

    }
}
