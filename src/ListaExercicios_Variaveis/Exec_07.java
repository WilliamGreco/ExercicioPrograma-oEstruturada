package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do raio...");
        int raio = ler.nextInt();

        double volume = (4 / 3) * Math.PI * raio;
        double area = 4 * Math.PI * raio * raio;

        System.out.println("O volume da esfere é de " + volume + " e a área da sua superficie é " + area);

    }

}
