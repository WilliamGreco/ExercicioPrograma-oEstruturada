package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_20 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe sua altura...");
        float altura = ler.nextFloat();
        System.out.println("Informe seu sexo F feminino ou M masculino...");
        String sexo = ler.next();

        int pesoH, pesoM;

        pesoH = (int) (72.7 * altura - 58);
        pesoM = (int) (62.1 * altura - 44.7);

        if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("f")) {
            System.out.println("Seu peso ideal é..." + pesoM + " kilos.");
        } else if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("m")) {
            System.out.println("Seu peso ideal é..." + pesoH + " kilos.");
        }

    }

}
