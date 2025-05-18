package unidadecinco;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pontosDireita = 0;
        int pontosEsquerda = 0;
        String ponto;

        while (true) {
            System.out.print("Informe o ponto (D para direita, E para esquerda): ");
            ponto = sc.next().toUpperCase();

            
            if (ponto.equals("D")) {
                pontosDireita++;
            } else if (ponto.equals("E")) {
                pontosEsquerda++;
            } else {
                System.out.println("Código inválido! Use apenas D ou E.");
                continue;
            }

           
            System.out.println("Placar: Direita " + pontosDireita + " x " + pontosEsquerda + " Esquerda");

            
            int diferenca = Math.abs(pontosDireita - pontosEsquerda);

            if ((pontosDireita >= 21 || pontosEsquerda >= 21) && diferenca >= 2) {
                if (pontosDireita > pontosEsquerda) {
                    System.out.println("Jogador da direita venceu!");
                } else {
                    System.out.println("Jogador da esquerda venceu!");
                }
                break;
            }
        }

        sc.close();
    }
}