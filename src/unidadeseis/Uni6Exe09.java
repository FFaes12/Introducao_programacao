package unidadeseis;

import java.util.Scanner;

public class Uni6Exe09 {

    public static void main(String[] args) {
        final int TOTAL = 30;
        int[] sexo = new int[TOTAL];    
        int[] nota = new int[TOTAL];    
        int[] idade = new int[TOTAL];

        lerDados(sexo, nota, idade);

        double mediaGeral = calcularMedia(nota);
        double mediaHomens = calcularMediaHomens(sexo, nota);
        int notaMulherMaisJovem = notaMulherMaisJovem(sexo, idade, nota);
        int mulheres50NotaMaiorMedia = mulheresMais50NotaMaiorMedia(sexo, idade, nota, mediaGeral);

        System.out.printf("Nota média recebida pelo cinema: %.2f\n", mediaGeral);
        System.out.printf("Nota média atribuída pelos homens: %.2f\n", mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Mulheres com mais de 50 anos que deram nota superior à média: " + mulheres50NotaMaiorMedia);
    }

    private static void lerDados(int[] sexo, int[] nota, int[] idade) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < sexo.length; i++) {
            System.out.println("Cliente " + (i + 1) + ":");
            do {
                System.out.print("Sexo (1=feminino, 2=masculino): ");
                sexo[i] = teclado.nextInt();
            } while (sexo[i] != 1 && sexo[i] != 2);

            do {
                System.out.print("Nota (0 a 10): ");
                nota[i] = teclado.nextInt();
            } while (nota[i] < 0 || nota[i] > 10);

            do {
                System.out.print("Idade: ");
                idade[i] = teclado.nextInt();
            } while (idade[i] < 0);
        }
    }

    private static double calcularMedia(int[] notas) {
        int soma = 0;
        for (int n : notas) {
            soma += n;
        }
        return (double) soma / notas.length;
    }

    private static double calcularMediaHomens(int[] sexo, int[] nota) {
        int soma = 0, cont = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 2) {
                soma += nota[i];
                cont++;
            }
        }
        return cont > 0 ? (double) soma / cont : 0.0;
    }

    private static int notaMulherMaisJovem(int[] sexo, int[] idade, int[] nota) {
        int menorIdade = Integer.MAX_VALUE;
        int notaMaisJovem = -1;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1 && idade[i] < menorIdade) {
                menorIdade = idade[i];
                notaMaisJovem = nota[i];
            }
        }
        return notaMaisJovem;
    }

    private static int mulheresMais50NotaMaiorMedia(int[] sexo, int[] idade, int[] nota, double media) {
        int cont = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > media) {
                cont++;
            }
        }
        return cont;
    }
}