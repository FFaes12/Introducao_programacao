import java.util.Scanner;                                                //calculo area circuferencia//
public class Uni2Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        
            System.out.println("insira a medida do raio de sua circuferencia");
            float r1 = teclado.nextFloat();
            double pi = 3.14159;
            double calculo = pi * Math.pow (r1, 2);
            System.out.println("a área da circunferência é cerca de "+ calculo);
            teclado.close();
    }
}
