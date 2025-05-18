package unidadecinco;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("O número deve ser positivo.");
            return;
        }
        
        System.out.println("número\tdecomposição");
        System.out.print(numero + "\t");
        
        int divisor = 2;
        int numeroOriginal = numero; 
        
        while (numero > 1) {
            if (numero % divisor == 0) {
             
                if (numero != numeroOriginal) {
                    System.out.print(", ");
                }
                System.out.print(divisor);
                numero /= divisor;
            } else {
                divisor++;
            }
        }
        
        System.out.println();
        scanner.close();
    }
}