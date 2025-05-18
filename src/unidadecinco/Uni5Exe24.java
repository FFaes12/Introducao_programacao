package unidadecinco;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Informe o limite diário de pesca (em kg): ");
        double limiteKg = sc.nextDouble();
        double limiteGramas = limiteKg * 1000;

        double totalPescado = 0;
        String resposta = "s";

        while (resposta.equalsIgnoreCase("s")) {
            
            System.out.print("Informe o peso do peixe (em gramas): ");
            double pesoPeixe = sc.nextDouble();

            totalPescado += pesoPeixe;

            System.out.printf("Peso total da pesca até agora: %.2f gramas\n", totalPescado);

           
            if (totalPescado > limiteGramas) {
                System.out.println("Limite diário excedido! Encerrando o programa.");
                break;
            }

        
            System.out.print("Deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            resposta = sc.next();
        }

        sc.close();
    }
}