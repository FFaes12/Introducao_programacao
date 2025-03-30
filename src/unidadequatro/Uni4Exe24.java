package unidadequatro;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        
        System.out.print("Informe o primeiro valor: ");
        int a = teclado.nextInt();
        System.out.print("Informe o segundo valor: ");
        int b = teclado.nextInt();
        System.out.print("Informe o terceiro valor: ");
        int c = teclado.nextInt();

        
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ordem crescente");
        System.out.println("2 - Ordem decrescente");
        System.out.println("3 - Maior valor no meio");
        System.out.print("Opção escolhida: ");
        int opc = teclado.nextInt();

        switch (opc) {                                         //dar uma revisada nesse
            case 1: 
                if (a > b) { int temp = a; a = b; b = temp; }
                if (a > c) { int temp = a; a = c; c = temp; }
                if (b > c) { int temp = b; b = c; c = temp; }
                System.out.println(a + " " + b + " " + c);
                break;

            case 2: 
                if (a < b) { int temp = a; a = b; b = temp; }
                if (a < c) { int temp = a; a = c; c = temp; }
                if (b < c) { int temp = b; b = c; c = temp; }
                System.out.println(a + " " + b + " " + c);
                break;

            case 3:
                int maior = Math.max(a, Math.max(b, c));
                int menor = Math.min(a, Math.min(b, c));
                int meio = a + b + c - maior - menor; // 
                System.out.println(menor + " " + maior + " " + meio);
                break;

            default:
            System.out.println("Erro: Opção inválida.");
            break;
        }

        teclado.close();
    }
}