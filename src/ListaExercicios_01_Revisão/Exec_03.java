package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int reajuste;

        System.out.println("Informe um valor...");
        double valor = ler.nextDouble();

        reajuste = (int) (valor * 0.1 / 100);

        System.out.println("Valor de reajuste é de..." + reajuste + "%");

    }

}
