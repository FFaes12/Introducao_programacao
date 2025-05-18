package unidadeseis;

import java.util.Scanner;

public class Uni6Exe03 {

    public Uni6Exe03() {
        float[] vetor = new float[12];
        Scanner teclado = new Scanner(System.in);

        lerValores(teclado, vetor);
        ajustarValores(vetor);
        escreverValores(vetor);
    }

    private void lerValores(Scanner teclado, float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o valor " + (i + 1) + ": ");
            vetor[i] = teclado.nextFloat();
        }
    }

    private void ajustarValores(float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { 
                vetor[i] *= 1.02;
            } else { // 
                vetor[i] *= 1.05;
            }
        }
    }

    private void escreverValores(float[] vetor) {
        System.out.println("Vetor ajustado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Posição %d: %.2f\n", i, vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Uni6Exe03();
    }
}