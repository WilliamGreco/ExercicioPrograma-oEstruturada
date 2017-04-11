package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do espaço inicial...");
        float espaço = ler.nextFloat();

        System.out.println("Informe o valor da velocidade inicial...");
        float velocidade = ler.nextFloat();

        System.out.println("Informe o valor da acelaração...");
        float aceleração = ler.nextFloat();

        System.out.println("Informe o valor do tempo...");
        float tempo = ler.nextFloat();

        float variação = (float) ((espaço + velocidade) * (tempo + 0.5) * (aceleração * tempo));

        System.out.println("O valor em metros é... " + variação);

    }

}
