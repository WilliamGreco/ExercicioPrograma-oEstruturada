package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_17 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero qualquer...");
        int numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este numero é PAR, sendo sua raiz quadrada no valor de..." + Math.sqrt(numero));
        } else {
            System.out.println("Este numero é IMPAR, sendo o numero elevado ao quadrado de..." + numero * numero);
        }

    }

}
