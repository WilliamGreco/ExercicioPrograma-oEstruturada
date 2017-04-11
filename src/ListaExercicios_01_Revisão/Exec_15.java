package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_15 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a primeira altura A...");
        float altura1 = ler.nextFloat();
        System.out.println("Informe a segunda altura B...");
        float altura2 = ler.nextFloat();

        if (altura1 > altura2) {
            System.out.println("A " + altura1 + " é maior que " + altura2 + " B...");
        } else if (altura2 > altura1) {
            System.out.println("B " + altura2 + " é maior que " + altura1 + " A...");
        }

    }

}
