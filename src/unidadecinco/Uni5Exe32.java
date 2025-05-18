package unidadecinco;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o dia da semana do primeiro dia (1=Domingo, 2=Segunda,...,7=Sábado): ");
        int primeiroDia = scanner.nextInt();
        
        System.out.print("Digite o número de dias no mês: ");
        int numDias = scanner.nextInt();
        
  
        if (primeiroDia >= 1 && primeiroDia <= 7) {
            if (numDias >= 1 && numDias <= 31) {
          
                System.out.println("D\tS\tT\tQ\tQ\tS\tS");
                
                
                int i = 1;
                while (i < primeiroDia) {
                    System.out.print("\t");
                    i++;
                }
                
              
                int diaAtual = 1;
                int diaSemana = primeiroDia;
                
                while (diaAtual <= numDias) {
                    System.out.print(diaAtual);
                    
                    if (diaSemana == 7) {
                        System.out.println();
                        diaSemana = 1;
                    } else {
                        System.out.print("\t");
                        diaSemana++;
                    }
                    
                    diaAtual++;
                }
                
                
                if (diaSemana != 1) {
                    System.out.println();
                }
            } else {
                System.out.println("Número de dias inválido. Deve ser entre 1 e 31.");
            }
        } else {
            System.out.println("Dia da semana inválido. Deve ser entre 1 e 7.");
        }
        
        scanner.close();
    }
}