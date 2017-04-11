package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_01 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro valor...");
        int valor1 = ler.nextInt();

        System.out.println("Informe o segundo valor...");
        int valor2 = ler.nextInt();

        int soma = valor1 + valor2;

        System.out.println("O resultado da soma dos valores é de..." + soma);

    }

}
