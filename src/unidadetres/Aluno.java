package unidadetres;

import java.util.Scanner;

public class Aluno {
    public static int numeroDeMatricula;
    public static String nome;
    public static char sexo;
    public final double pi = 3.14159;
 public static void main(String[] args) {
    numeroDeMatricula = informarNumeroDeMatricula();
 }
    public static int informarNumeroDeMatricula(){
    
        Scanner teclado = new Scanner (System.in);
        numeroDeMatricula = teclado.nextInt();
        return numeroDeMatricula;

    }

}
