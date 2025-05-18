package unidadecinco;

public class Uni5Exe22 {
    public static void main(String[] args) {
        double salario = 2000.0;
        double percentual = 0.015; 
        int ano = 1996;
        int anoAtual = 2025; 

        while (ano <= anoAtual) {
            salario += salario * percentual;
            percentual *= 2;
            ano++;
        }

        System.out.printf("O salário atual em %d é: R$ %.2f%n", anoAtual, salario);
    }
}

