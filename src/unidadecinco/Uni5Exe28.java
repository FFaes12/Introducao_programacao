package unidadecinco;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int votosNenhum = 0, votosCPM22 = 0, votosSkank = 0, votosJotaQuest = 0;
        int totalVotos = 0;

        System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
        String continuar = sc.next().toLowerCase();

        while (continuar.equals("s")) {
            System.out.println("Vote no seu conjunto favorito:");
            System.out.println("1 - Nenhum de Nós");
            System.out.println("2 - CPM22");
            System.out.println("3 - Skank");
            System.out.println("4 - Jota Quest");
            System.out.print("Digite o código do seu voto (1 a 4): ");
            int voto = sc.nextInt();

            switch (voto) {
                case 1:
                    votosNenhum++;
                    break;
                case 2:
                    votosCPM22++;
                    break;
                case 3:
                    votosSkank++;
                    break;
                case 4:
                    votosJotaQuest++;
                    break;
                default:
                    System.out.println("Código inválido! Vote apenas com os códigos de 1 a 4.");
                    continue;
            }

            totalVotos++;

            System.out.print("Mais um voto: s (SIM) / n (NÃO)? ");
            continuar = sc.next().toLowerCase();
        }

        System.out.println("\nResultado da votação:");
        System.out.println("Nenhum de Nós: " + votosNenhum + " votos (" + (totalVotos == 0 ? 0 : String.format("%.2f", votosNenhum * 100.0 / totalVotos)) + "%)");
        System.out.println("CPM22: " + votosCPM22 + " votos (" + (totalVotos == 0 ? 0 : String.format("%.2f", votosCPM22 * 100.0 / totalVotos)) + "%)");
        System.out.println("Skank: " + votosSkank + " votos (" + (totalVotos == 0 ? 0 : String.format("%.2f", votosSkank * 100.0 / totalVotos)) + "%)");
        System.out.println("Jota Quest: " + votosJotaQuest + " votos (" + (totalVotos == 0 ? 0 : String.format("%.2f", votosJotaQuest * 100.0 / totalVotos)) + "%)");

        int maior = Math.max(Math.max(votosNenhum, votosCPM22), Math.max(votosSkank, votosJotaQuest));
        System.out.print("Grupo vencedor: ");
        if (votosNenhum == maior) {
            System.out.println("Nenhum de Nós");
        } else if (votosCPM22 == maior) {
            System.out.println("CPM22");
        } else if (votosSkank == maior) {
            System.out.println("Skank");
        } else {
            System.out.println("Jota Quest");
        }

        sc.close();
    }
}