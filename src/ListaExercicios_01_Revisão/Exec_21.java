package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_21 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a idade do nadador...");
        int idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("Idade ADULTO...");
        } else if (idade >= 14) {
            System.out.println("Idade JUVENIL...");
        } else if (idade >= 9) {
            System.out.println("Idade INFANTIL...");
        } else if (idade < 9) {
            System.out.println("Idade MIRIM...");
        }

    }

}
