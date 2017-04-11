package ListaExercicios_Variaveis;

import java.util.Scanner;

public class Exec_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a nota da avaliação U1...");
        float nota1 = ler.nextFloat();

        System.out.println("Informe a nota da avaliação U2...");
        float nota2 = ler.nextFloat();

        System.out.println("Informe a nota do exame...");
        float exame = ler.nextFloat();

        float media = ((nota1 * 2) + (nota2 * 3) + (exame * 5)) / 3;

        System.out.println("Sua media final é de... " + media);

    }
}
