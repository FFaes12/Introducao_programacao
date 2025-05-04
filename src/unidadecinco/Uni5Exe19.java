package unidadecinco;
import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorCompra = -1;
        double valorTotalRecebido = 0;

        while (true) {
            System.out.print("Valor da compra: ");
            valorCompra = teclado.nextDouble();

            if (valorCompra == 0) {
                break;
            }

            double valorAPagar;

            if (valorCompra > 500) {
                valorAPagar = valorCompra * 0.8; 
            } else {
                valorAPagar = valorCompra * 0.85; 
            }

            System.out.printf("Valor a pagar: R$%.2f\n", valorAPagar);

            valorTotalRecebido += valorAPagar;
        }

        System.out.printf("O valor total recebido foi de R$%.2f\n", valorTotalRecebido);
        teclado.close();
    }
}