package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_18 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro cateto...");
        float cateto1 = ler.nextFloat();
        System.out.println("Informe o valor do segundo cateto...");
        float cateto2 = ler.nextFloat();

        float hipotenusa;

        hipotenusa = (float) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        if (hipotenusa > 100) {
            System.out.println("Valor da hipotenusa é " + hipotenusa + " sendo assim muito grande...");
        } else {
            System.out.println("Valor da hipotenusa é " + hipotenusa + " sendo assim muito pequena...");
        }

    }

}
