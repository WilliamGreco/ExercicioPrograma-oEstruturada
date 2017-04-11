package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um valor em para compra...");
        float valor1 = ler.nextFloat();

        System.out.println("O valor informado convertido em dolares será de R$ " + valor1 * 2.40);

    }

}
