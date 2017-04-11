package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do cateto A...");
        float catetoA = ler.nextFloat();

        System.out.println("Informe o valor do cateto B...");
        float catetoB = ler.nextFloat();

        float hipotenusa = (float) Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.println("O valor da hipotenusa é de " + hipotenusa);

    }
}
