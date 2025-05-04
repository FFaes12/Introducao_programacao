package unidadecinco;

public class Uni5Exe11 {
    public static void main(String[] args) {
        int horas = 16;
        int quebradosNaHora = 1;
        int totalQuebrados = 0;

        for (int i = 1; i <= horas; i++) {
            totalQuebrados += quebradosNaHora;
            quebradosNaHora *= 3; 
        }

        System.out.println("Total de biscoitos quebrados no final de cada dia: " + totalQuebrados);
    }
}

