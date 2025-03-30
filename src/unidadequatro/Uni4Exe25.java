package unidadequatro;

import java.util.Scanner;

public class Uni4Exe25 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        int a = teclado.nextInt();
        System.out.println("Informe o segundo numero:");
        int b = teclado.nextInt();
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números");
        System.out.println("Opção escolhida:");
        int opc = teclado.nextInt();

        switch (opc) {

            case 1:
                int soma = a + b;
                System.out.println(soma);
                break;
            case 2:
                int diferença = a - b;
                System.out.println(diferença);
                break;
            case 3:
                int prod = a * b;
                System.out.println(prod);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Erro: Valor Invalido");
                } else {
                    int divisao = a / b;
                    System.out.println("Resultado: " + divisao);
                }
                break;

            default:
            System.out.println("Valor invalido");
            break;

        }
        teclado.close();

    }
}
