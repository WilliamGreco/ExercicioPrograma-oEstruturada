package ListaExercicios_01_Revisão;

import java.util.Scanner;

public class Exec_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double salarioBruto, salarioLiquido, descontoINSS;

        System.out.println("Calculo de salario liquido...");
        System.out.println("");
        System.out.println("Informe o valor da hora aula...");
        double horaAula = ler.nextDouble();
        System.out.println("Informe o valor de numero de aulas dadas...");
        int horas = ler.nextInt();
        System.out.println("Informe o valor de desconto referente ao INSS...");
        int inss = ler.nextInt();

        salarioBruto = horaAula * horas;
        descontoINSS = salarioBruto * (inss / 100);
        salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("O salario liquido do professor é de R$..." + salarioLiquido);

    }

}
