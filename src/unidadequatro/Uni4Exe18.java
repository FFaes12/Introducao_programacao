package unidadequatro;

import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o dia de vencimento do produto");
        int diav = teclado.nextInt();
        System.out.println("Informe o dia de pagamento do produto ");
        int diap = teclado.nextInt();
        System.out.println("Informe o valor da prestação");
        int vp = teclado.nextInt();

        if (diap < diav || diap == diav) {
            double descont = vp - vp * 0.1;
            System.out.println("O pagamento está em dia. O valor da prestação = R$ " + descont);
        } else if (diap <= diav + 5) {
            System.out.println("O pagamento está atrasado. O valor da prestação = R$ " + vp);
        } else if (diap > diav + 5) {
            int diaatraso = diap - diav;
            double acrescimo = diaatraso * 0.02 * vp;
            double valorfinal = acrescimo+ vp;
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$ " + valorfinal);
        }
        teclado.close();

    }
}
