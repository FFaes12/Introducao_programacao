package unidadetres;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Uni3Exe03 {
     public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe o preço do litro da gasolina");
        float p = teclado.nextFloat();
        System.out.println("informe o valor do pagamento realizado");
        float pay = teclado.nextFloat();
        double litros = pay / p;
        System.out.printf("O motorista conseguiu colocar %.2f\n" , litros);
        teclado.close();

    }
}
