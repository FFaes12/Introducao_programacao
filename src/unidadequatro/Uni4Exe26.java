package unidadequatro;

import java.util.Scanner;

public class Uni4Exe26 {

    public static void main(String[] args) {                                 //revisara
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("T: calcular a área de um triângulo");
        System.out.println("Q: calcular a área de um quadrado");
        System.out.println("R: calcular a área de um retângulo");
        System.out.println("C: calcular a área de um círculo");

        char opcao = scanner.next().charAt(0);

        switch (Character.toUpperCase(opcao)) {
            case 'T':
                System.out.print("Digite a base e a altura do triângulo: ");
                double baseT = scanner.nextDouble();
                double alturaT = scanner.nextDouble();
                System.out.println("Área do triângulo = " + (baseT * alturaT / 2));
                break;

            case 'Q':
                System.out.print("Digite o lado do quadrado: ");
                double ladoQ = scanner.nextDouble();
                System.out.println("Área do quadrado = " + (ladoQ * ladoQ));
                break;

            case 'R':
                System.out.print("Digite a base e a altura do retângulo: ");
                double baseR = scanner.nextDouble();
                double alturaR = scanner.nextDouble();
                System.out.println("Área do retângulo = " + (baseR * alturaR));
                break;

            case 'C':
                System.out.print("Digite o raio do círculo: ");
                double raioC = scanner.nextDouble();
                System.out.println("Área do círculo = " + (Math.PI * Math.pow(raioC, 2)));
                break;

            default:
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
