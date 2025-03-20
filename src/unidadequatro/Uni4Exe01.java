package unidadequatro;

import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas");
        float ht = teclado.nextFloat();
        System.out.println("Digite o valor pago por hora");
        float ph = teclado.nextFloat();
        float stt = ht * ph;
        if (ht < 160) {
            System.out.println("O salario total é: " + stt);
        } else {
            float se = (ht - 160) * (ph / 2);
            stt = stt + se;
            System.out.println("O salario total é: " + stt);
        }
        teclado.close();
    }
}
