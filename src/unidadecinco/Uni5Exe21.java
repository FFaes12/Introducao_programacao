package unidadecinco;

public class Uni5Exe21 {
    public static void main(String[] args) {
        int alturaChico = 150; 
        int alturaZe = 110;    
        int anos = 0;

        while (alturaZe <= alturaChico) {
            alturaChico += 2;
            alturaZe += 3;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que Zé seja mais alto que Chico.");
    }
}
