package estruturasequencial;

import java.util.Scanner;
public class ex08 {
    //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ganhoPorHora,salario;
        int numeroHorasTrabalhadas;


        System.out.println("Quanto vc ganha por hora");
        ganhoPorHora = entrada.nextDouble();

        System.out.println("Quando horas trabalhadas vc tem");
        numeroHorasTrabalhadas = entrada.nextInt();

        salario = ganhoPorHora*numeroHorasTrabalhadas;

        System.out.println("O seu salário é: " + salario);
    }
}
