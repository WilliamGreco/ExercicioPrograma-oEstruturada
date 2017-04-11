package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_23 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double compra, venda;

        System.out.println("Informe o valor da compra...");
        compra = ler.nextDouble();

        if (compra < 20) {
            venda = (double) (compra + (compra * 0.45));
        } else {
            venda = (double) (compra + (compra * 0.30));
        }

        System.out.println("O Valor da venda será de R$ " + venda);
    }

}
