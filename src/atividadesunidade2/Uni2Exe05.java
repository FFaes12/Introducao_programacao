package atividadesunidade2;
import java.util.Scanner;
public class Uni2Exe05 {                                                            //opercações aritmeticas com valores dados pelo usuario//
    public static void main(String[] args) {
        Scanner telcado = new Scanner (System.in);


        System.out.println("insira um valor ");
        int n1 = telcado.nextInt();
        System.out.println("insira mais um valor");
        int n2 = telcado.nextInt();
        System.out.println("insira o terceiro valor");
        int n3 = telcado.nextInt();
        System.out.println("insira o ultimo valor");
        int n4 = telcado.nextInt();

        int formula = (n1 * n2 - n3 * n4);
        System.out.println("a diferença do produto do primeiro e segundo valor pelo produto do terceiro e quarto valor "+ (formula));
        telcado.close();
    }

}
