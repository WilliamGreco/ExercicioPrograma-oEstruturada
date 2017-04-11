package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_22 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de um numero inteiro...");
        int numero = ler.nextInt();

        if (numero % 10 == 0) {
            System.out.println("É divisivel por 10...");
        } else {
            System.out.println("Não é divisivel por 10...");
        }

        if (numero % 5 == 0) {
            System.out.println("É divisivel por 5...");
        } else {
            System.out.println("Não é divisivel por 5...");
        }

        if (numero % 2 == 0) {
            System.out.println("É divisivel por 2...");
        } else {
            System.out.println("Não é divisivel por 2...");
        }

    }
}
