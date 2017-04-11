package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_14 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro numero...");
        int primeiro = ler.nextInt();
        System.out.println("Informe o segundo numero...");
        int segundo = ler.nextInt();

        if (primeiro > segundo) {
            System.out.println("O numero maior é..." + primeiro);
        } else if (segundo > primeiro) {
            System.out.println("O numero maior é..." + segundo);
        }

    }

}
