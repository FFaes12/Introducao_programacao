package unidadecinco;

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Digite o valor inicial N: ");
        int n = sc.nextInt();
        System.out.print("Digite o decremento K: ");
        int k = sc.nextInt();
        System.out.print("Digite o tamanho da mochila M: ");
        int m = sc.nextInt();

      
        String elementosTotais = "";
        String elementosDentro = "";
        String elementosFora = "";
        int somaDentro = 0;
        int somaFora = 0;

        int atual = n;

        
        while (atual > 0) {
            elementosTotais += atual + " ";

            if (somaDentro + atual <= m) {
                elementosDentro += atual + " ";
                somaDentro += atual;
            } else {
                elementosFora += atual + " ";
                somaFora += atual;
            }

            atual -= k;
        }

        
        System.out.println("\nElementos a serem colocados na mochila: " + elementosTotais);
        System.out.println("Elementos que entraram na mochila: " + elementosDentro);
        System.out.println("Elementos que ficaram fora da mochila: " + elementosFora);
        System.out.println("Soma dos elementos que entraram: " + somaDentro);
        System.out.println("Soma dos elementos que não entraram: " + somaFora);

        sc.close();
    }
}