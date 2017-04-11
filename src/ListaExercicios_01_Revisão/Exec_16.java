package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_16 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int aniversario;
        int anoAtual = 2017;

        System.out.println("Informe em que ano você nasceu...");
        int anos = ler.nextInt();

        aniversario = anoAtual - anos;

        if (aniversario >= 18) {
            System.out.println("Você tem " + aniversario + ", anos de idade sendo assim você tem mais que 18 anos...");
        } else if (aniversario >= 15 && aniversario < 18) {
            System.out.println("Você tem " + aniversario + ", anos de idade e esta entre 15 e 18 anos...");
        } else if (aniversario < 15) {
            System.out.println("Vocte tem " + aniversario + ", anos de idade sendo assim você é menor de idade...");
        }

    }

}
