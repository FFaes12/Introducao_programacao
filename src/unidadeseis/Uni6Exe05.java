package unidadeseis;

import java.util.Scanner;

public class Uni6Exe05 {

    public static void main(String[] args) {
        String[] perguntas = {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta de Oktoberfest?"
        };

        String[] rapaz = new String[5];
        String[] moca = new String[5];

        Scanner teclado = new Scanner(System.in);

        System.out.println("Respostas do rapaz:");
        lerRespostas(teclado, rapaz, perguntas);

        System.out.println("\nRespostas da moça:");
        lerRespostas(teclado, moca, perguntas);

        int afinidade = calcularAfinidade(rapaz, moca);

        System.out.println("\nÍndice de afinidade: " + afinidade);
        System.out.println(mensagemAfinidade(afinidade));
    }

    
    private static void lerRespostas(Scanner teclado, String[] respostas, String[] perguntas) {
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + " (SIM/NÃO/IND): ");
            respostas[i] = teclado.nextLine().trim().toUpperCase();
        }
    }

    
    private static int calcularAfinidade(String[] r1, String[] r2) {
        int afinidade = 0;
        for (int i = 0; i < r1.length; i++) {
            if (r1[i].equals(r2[i])) {
                afinidade += 3;
            } else if (r1[i].equals("IND") || r2[i].equals("IND")) {
                afinidade += 1;
            } else if ((r1[i].equals("SIM") && r2[i].equals("NÃO")) || (r1[i].equals("NÃO") && r2[i].equals("SIM"))) {
                afinidade -= 2;
            }
        }
        return afinidade;
    }

    private static String mensagemAfinidade(int afinidade) {
        if (afinidade == 15) {
            return "Casem!";
        } else if (afinidade >= 10) {
            return "Vocês têm muita coisa em comum!";
        } else if (afinidade >= 5) {
            return "Talvez não dê certo :(";
        } else if (afinidade >= 0) {
            return "Vale um encontro.";
        } else if (afinidade >= -9) {
            return "Melhor não perder tempo";
        } else {
            return "Vocês se odeiam!";
        }
    }
}