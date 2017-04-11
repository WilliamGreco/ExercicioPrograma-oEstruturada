package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero inteiro...");
        int numero = ler.nextInt();

        int sucessor = numero + 1;
        System.out.println("\nO numero sucessor é..." + sucessor);
        int antecessor = numero - 1;
        System.out.println("\nO numero antecessor é..." + antecessor);

    }

}
