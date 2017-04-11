package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro numero inteiro...");
        int primeiro = ler.nextInt();
        System.out.println("Informe o segundo numero inteiro...");
        int segundo = ler.nextInt();
        System.out.println("Informe o terceiro numero inteiro...");
        int terceiro = ler.nextInt();

        float media = (primeiro + segundo + terceiro) / 2;

        System.out.println("A media para os valores informados é..." + media);

    }

}
