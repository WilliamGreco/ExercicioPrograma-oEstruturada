package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor em segundos...");
        int totalSegundos = ler.nextInt();

        int segundoAtual = totalSegundos % 60;
        int totalMinutos = totalSegundos / 60;
        int minutoAtual = totalMinutos % 60;
        int totalHora = totalMinutos / 60;
        int horaAtual = totalHora % 24;

        System.out.println(horaAtual + "h:" + minutoAtual + "m:" + segundoAtual + "s");

    }
}
