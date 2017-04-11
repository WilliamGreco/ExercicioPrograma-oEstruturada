package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do raio...");
        int raio = ler.nextInt();

        double areaCirculo = Math.PI * raio * raio;
        double areaComprimento = 2 * Math.PI * raio;

        System.out.println("Com o valor do raio, a área da circunferência é " + areaCirculo + " e do comprimento é de " + areaComprimento);

    }

}
