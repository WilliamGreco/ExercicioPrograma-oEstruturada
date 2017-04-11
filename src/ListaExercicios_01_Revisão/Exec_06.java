package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informar seu saldo no banco...");
        float saldo = ler.nextFloat();

        float reajuste;

        reajuste = (float) (saldo * 0.01);

        System.out.println("Seu saldo é de..." + saldo + ", com um reajuste de..." + reajuste);
    }

}
