package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero...");
        int numero = ler.nextInt();

        if (numero >= 0) {
            System.out.println("O Valor da raiz quadrada do numero é... " + Math.sqrt(numero));
        } else if (numero < 0) {
            System.out.println("O Valor ao quadrado do numero é..." + numero * numero);
        }
    }

}
