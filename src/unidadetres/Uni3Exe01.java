package unidadetres;
import java.util.Scanner;
public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Insira o comprimento do terreno");
        int c = teclado.nextInt();
        System.out.println("Insira a medida da largura do terreno");
        int l = teclado.nextInt();
        int area = c * l;
        System.out.println(area);
        teclado.close();
    }

}
