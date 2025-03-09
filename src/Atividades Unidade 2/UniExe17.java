import java.util.Scanner;
public class UniExe17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Informe seu nome");
        String nome = teclado.nextLine();
        System.out.println("Informe seu numero de horas mensais trabalhadas");                      //salario com desconto porcentagem
        float hm = teclado.nextFloat();
        System.out.println("informe seu numero de dependentes");
        int dp = teclado.nextInt();
        float saltra = hm * 10;
        float salfamily = dp * 60;
        saltra *= 0.95;
        saltra *= 0.915;
        double salliq = saltra + salfamily;
        double salbru = (hm*10) + (dp*60);
        
        System.out.println("Você, funcionario " + nome + " recebe um salario bruto de " + salbru + " e um salario liquido de " +salliq );
        teclado.close();
     }

}
