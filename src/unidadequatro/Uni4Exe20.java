package unidadequatro;

import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Informe a primeira nota");
        float n1 = teclado.nextFloat();
        System.out.println("Informe a segunda nota");
        float n2 = teclado.nextFloat();
        System.out.println("Informe a terceira nota");
        float n3 = teclado.nextFloat();
        System.out.println("Informe a nota dos exercícios");
        float n4 = teclado.nextFloat();

        
        float media = (n1 + (n2 * 2) + (n3 * 3) + n4) / 7;

       
        String situ;
        String conc;

        
        if (media >= 9.0) {
            conc = "A";
        } else if (media >= 7.5) {
            conc = "B";
        } else if (media >= 6) {
            conc = "C";
        } else if (media >= 4) {
            conc = "D";
        } else {
            conc = "E";
        }

        if (media >= 6) {
            situ = "Aprovado";
        } else {
            situ = "Reprovado";
        }

        
        System.out.println("A média de aproveitamento foi: " + media + ". Conceito: " + conc + ". Situação: " + situ);
        
        teclado.close();
    }
}