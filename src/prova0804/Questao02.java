package prova0804;

import java.util.Scanner;

public class Questao02 {
  public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
     System.out.print("Hora de chegada: ");
        int horaChegada = teclado.nextInt();
        System.out.print("Minuto de chegada: ");
        int minChegada = teclado.nextInt();
        System.out.print("Hora de saída: ");
        int horaSaida = teclado.nextInt();
        System.out.print("Minuto de saída: ");
        int minSaida = teclado.nextInt();

        if (horaChegada < 0 || horaChegada > 23 || minChegada < 0 || minChegada > 59
                || horaSaida < 0 || horaSaida > 23 || minSaida < 0 || minSaida > 59
                || (horaSaida < horaChegada) || (horaSaida == horaChegada && minSaida < minChegada)) {
            System.out.println("Entrada inválida!");
            return;
        }

        int minutosTotais = (horaSaida * 60 + minSaida) - (horaChegada * 60 + minChegada);

        int horasPagas;
        if (minutosTotais <= 29) {
            horasPagas = (minutosTotais > 0) ? 1 : 0;
        } else {
            horasPagas = (minutosTotais + 30) / 60;
        }

        int preco = 0;
        switch (horasPagas) {
            case 1:
            case 2:
                preco = horasPagas * 10;
                break;
            case 3:
            case 4:
                preco = 2 * 5 + (horasPagas - 2) * 15;
                break;
            default:
                if (horasPagas > 4) {
                    preco = 2 * 5 + 2 * 7 + (horasPagas - 4) * 20;
                }
                break;
        }

        System.out.println("Preço cobrado = R$" + preco + ",00");

        teclado.close();

  }
}
