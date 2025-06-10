package aulamatematica;

import java.util.Scanner;

public class TrabalhoMatematicaPrimeiro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Simulador de função quadrática");
        System.out.println("Alunos: Felipe Faes, Rodrigo Thewis");

        System.out.println("Insira o valor de a:");
        double a = teclado.nextDouble();
        System.out.println("Insira o valor de b:");
        double b = teclado.nextDouble();
        System.out.println("Insira o valor de c:");
        double c = teclado.nextDouble();
        double delta = (b * b) - (4 * a * c);
        System.out.println("O valor de delta é: " + delta);
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);            //sqrt = raiz quadrada
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
        }
        teclado.close();
    }
}
