package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Favor informar o preço de um produto...");
        float preço = ler.nextFloat();

        float novopreço;

        novopreço = (float) (preço * 0.9);

        System.out.println("Valor do produto é R$ " + preço + " com um desconto de 9% o novo valor será de R$ " + novopreço);

    }

}
