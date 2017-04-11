package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_13 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int somatoria = 0;

        System.out.println("Informe o valor inferior...");
        int inferior = ler.nextInt();
        System.out.println("Informe o valor superior...");
        int superior = ler.nextInt();

        if (inferior % 2 != 0) {
            inferior = inferior + 1;
            inferior++;
        }
        int i;
        for (i = inferior; i <= superior; i = i + 2) {
            somatoria = somatoria + 1;
            System.out.println("Pares do intervalo...");

        }
        System.out.println("Os numero somados no intervalo é..." + somatoria);
    }

}
