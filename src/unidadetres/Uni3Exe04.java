package unidadetres;
import java.util.Scanner;
public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("informe sua primeira nota");
        float n1 = teclado.nextFloat();
        System.out.println("informe sua segunda nota");  
        float n2 = teclado.nextInt();
        System.out.println("informe a ultima nota");  
        float n3 = teclado.nextInt();
        double media = (n1*0.5) + (n2*0.3) + (n3 *0.2);
        System.out.println("Sua media é "+ media);
        teclado.close();
    }
}
