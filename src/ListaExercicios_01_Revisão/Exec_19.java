package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_19 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de um numero inteiro...");
        int numero = ler.nextInt();

        if (numero < 3) {
            System.out.println("Numero menor que 3...");
        } else if (numero > 25) {
            System.out.println("Numero maior que 25...");
        }

    }

}
