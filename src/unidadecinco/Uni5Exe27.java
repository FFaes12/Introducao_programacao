package unidadecinco;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorProducao = 0;
        int funcionarioMaiorProducao = 0;
        String turnoMaiorProducao = "";
        int diaMaiorProducao = 0;

        while (true) {
            System.out.print("Informe o dia do mês de abril (1 a 30 ou -1 para encerrar): ");
            int dia = sc.nextInt();

            if (dia == -1) {
                break;
            }

            if (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
                continue;
            }

            System.out.print("Informe a produção no turno da manhã: ");
            int manha = sc.nextInt();
            System.out.print("Informe a produção no turno da tarde: ");
            int tarde = sc.nextInt();

            double valorRecebido = 0;

            if (dia >= 1 && dia <= 15) {
                int totalProducao = manha + tarde;

                if (manha >= 30 && tarde >= 30 && totalProducao >= 100) {
                    valorRecebido = totalProducao * 0.8;
                } else {
                    valorRecebido = totalProducao * 0.5;
                }

            } else {
                valorRecebido = (manha * 0.4) + (tarde * 0.3);
            }

            System.out.printf("R$ %.2f (valor recebido)\n", valorRecebido);

        
            if (manha > maiorProducao) {
                maiorProducao = manha;
                funcionarioMaiorProducao = 1;
                turnoMaiorProducao = "manhã";
                diaMaiorProducao = dia;
            }

            if (tarde > maiorProducao) {
                maiorProducao = tarde;
                funcionarioMaiorProducao = 1;
                turnoMaiorProducao = "tarde";
                diaMaiorProducao = dia;
            }

           
            System.out.print("Novo funcionário (1.sim 2.não)? ");
            int novo = sc.nextInt();
            if (novo != 1) {
                break;
            }
        }

        System.out.println("\nResumo Final:");
        System.out.println("Maior produção: " + maiorProducao + " peças");
        System.out.println("Turno da maior produção: " + turnoMaiorProducao);
        System.out.println("Dia: " + diaMaiorProducao);

        sc.close();
    }
}