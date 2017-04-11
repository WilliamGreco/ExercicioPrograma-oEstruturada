package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Favor informe seu nome completo...");
        String nome = ler.nextLine();
        System.out.println("Informe seu sexo... F feminino ou M masculino...");
        String sexo = ler.nextLine();
        System.out.println("Informe sua idade...");
        byte idade = ler.nextByte();

        if (sexo.equalsIgnoreCase("F") && idade < 25) {
            System.out.println(nome + ", ACEITA...");
        } else {
            System.out.println("NÃO ACEITA...");
        }

    }

}
