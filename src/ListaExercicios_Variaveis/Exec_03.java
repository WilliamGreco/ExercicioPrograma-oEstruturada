package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_03 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor qualquer...");
        int valor = ler.nextInt();

        float reajuste = (valor * 10 / 100);

        System.out.println("O valor informado teve um reajuste de " + reajuste + " 10%...");

    }

}
