package unidadequatro;

import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        
        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia <= 31) {
                    System.out.println("Data válida");
                } else {
                    System.out.println("Data inválida");
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia <= 30) {
                    System.out.println("Data válida");
                } else {
                    System.out.println("Data inválida");
                }
            } else if (mes == 2) {
                
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    if (dia <= 29) {
                        System.out.println("Data válida");
                    } else {
                        System.out.println("Data inválida");
                    }
                } else {
                    if (dia <= 28) {
                        System.out.println("Data válida");
                    } else {
                        System.out.println("Data inválida");
                    }
                }
            } else {
                System.out.println("Data inválida");
            }
        } else {
            System.out.println("Data inválida");
        }

        scanner.close();
    }
}
