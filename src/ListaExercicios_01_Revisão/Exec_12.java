package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int aniversario;

        System.out.println("Informe seu ano de nacimento...");
        int anoN = ler.nextInt();
        System.out.println("Informe o ano atual...");
        int anoA = ler.nextInt();

        aniversario = anoA - anoN;

        System.out.println("Sua idade é de " + aniversario + " anos...");

    }

}
