package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor de um numero inteiro...");
        int numero = ler.nextInt();

        System.out.println("O valor ao quadrado é de..." + numero * numero);

    }

}
