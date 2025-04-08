package prova0804;

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {
        Scanner teclafo = new Scanner(System.in);

        int hChegada, mChegada, hSaida, mSaida;

        System.out.println("Digite a hora e minuto de chegada:");
        hChegada = teclafo.nextInt();
        mChegada = teclafo.nextInt();

        System.out.println("Digite a hora e minuto de saída:");
        hSaida = teclafo.nextInt();
        mSaida = teclafo.nextInt();

        if (hChegada < 0 || hChegada > 23 || mChegada < 0 || mChegada > 59
                || hSaida < 0 || hSaida > 23 || mSaida < 0 || mSaida > 59) {
            System.out.println("Horario invalido");
            return;
        }

        if (hSaida < hChegada || (hSaida == hChegada && mSaida <= mChegada)) {
            System.out.println("Horario de saida deve ser depois da chegada");
            return;
        }

        int minutosTotaisChegada = hChegada * 60 + mChegada;
        int minutosTotaisSaida = hSaida * 60 + mSaida;
        int tempoTotalMinutos = minutosTotaisSaida - minutosTotaisChegada;

        int horas = tempoTotalMinutos / 60;
        int minutosRestantes = tempoTotalMinutos % 60;

        if (tempoTotalMinutos <= 30) {
            horas = 1;
        } else {
            if (minutosRestantes <= 29) {

            } else {
                horas += 1;
            }
        }

        int preco = 0;

        switch (horas) {
            case 1:
                preco = 10;
                break;
            case 2:
                preco = 20;
                break;
            case 3:
                preco = 35;
                break;
            default:
                preco = 35 + (horas - 3) * 20;
        }

        System.out.println("Preço a pagar: R$ " + preco + ",00");

        teclafo.close();
    }
}
