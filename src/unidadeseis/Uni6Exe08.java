package unidadeseis;

import java.util.Scanner;

public class Uni6Exe08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;
        do {
            System.out.print("Informe o tamanho do vetor (até 20): ");
            n = teclado.nextInt();
        } while (n < 1 || n > 20);

        double[] vetor = new double[n];

     
        for (int i = 0; i < n; i++) {
            System.out.print("Informe o valor para a posição " + (i + 1) + ": ");
            vetor[i] = teclado.nextDouble();
        }

      
        double[] valoresUnicos = new double[n];
        int[] frequencias = new int[n];
        int qtdUnicos = 0;

        for (int i = 0; i < n; i++) {
            boolean jaContado = false;
            for (int j = 0; j < qtdUnicos; j++) {
                if (vetor[i] == valoresUnicos[j]) {
                    jaContado = true;
                    break;
                }
            }
            if (!jaContado) {
                valoresUnicos[qtdUnicos] = vetor[i];
                int freq = 0;
                for (int k = 0; k < n; k++) {
                    if (vetor[k] == vetor[i]) {
                        freq++;
                    }
                }
                frequencias[qtdUnicos] = freq;
                qtdUnicos++;
            }
        }

        System.out.printf("%-10s%-10s\n", "VALOR", "FREQUÊNCIA");
        for (int i = 0; i < qtdUnicos; i++) {
            System.out.printf("%-10.2f%-10d\n", valoresUnicos[i], frequencias[i]);
        }
    }
}