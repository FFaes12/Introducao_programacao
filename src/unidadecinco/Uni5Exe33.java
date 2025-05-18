package unidadecinco;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Inicialização dos contadores
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0, votosCandidato4 = 0;
        int votosNulos = 0, votosBranco = 0;
        int totalVotos = 0;
        int voto;
        
        System.out.println("Sistema de Votação");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("4 - Candidato 4");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Encerrar votação\n");
        
        do {
            System.out.print("Digite o código do voto: ");
            voto = scanner.nextInt();
            
          
            if (voto == 0) {
                break; 
            } else if (voto >= 1 && voto <= 6) {
                totalVotos++;
                switch (voto) {
                    case 1: votosCandidato1++; break;
                    case 2: votosCandidato2++; break;
                    case 3: votosCandidato3++; break;
                    case 4: votosCandidato4++; break;
                    case 5: votosNulos++; break;
                    case 6: votosBranco++; break;
                }
            } else {
                System.out.println("Opção incorreta! Digite um valor entre 0 e 6.");
            }
        } while (true); 
        
        // Cálculos finais
        double percentualBrancoNulos = 0;
        if (totalVotos > 0) {
            percentualBrancoNulos = (votosBranco + votosNulos) * 100.0 / totalVotos;
        }
        
        // Resultados
        System.out.println("\nResultado da Eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");
        System.out.println("Candidato 4: " + votosCandidato4 + " votos");
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos em Branco: " + votosBranco);
        System.out.printf("Percentual de brancos e nulos: %.2f%%\n", percentualBrancoNulos);
        
        scanner.close();
    }
}