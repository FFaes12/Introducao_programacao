import java.util.Scanner;
public class Uni2Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);                                                          //conversão dolar-real
        System.out.println("Qual o valor desejado para ser convertido de dolares para reais");
        float v1 = teclado.nextFloat();
        double conversao = v1 * 5.89;
        System.out.println("O valor final após ser convertido é de "+ conversao);
        teclado.close();
    }
}
