package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma;

        System.out.println("Informe o primeiro numero inteiro...");
        int primeiro = ler.nextInt();
        System.out.println("Informe o segundo numero inteiro...");
        int segundo = ler.nextInt();

        soma = primeiro + segundo;

        if (soma > 10) {
            System.out.println("Resultado da soma é..." + soma);
        } else {
            System.out.println("Sem resultado de soma...");
        }

    }

}
