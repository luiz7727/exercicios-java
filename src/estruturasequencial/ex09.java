package estruturasequencial;

import java.util.Scanner;
public class ex09 {
    //Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    //C = 5 * ((F-32) / 9).
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double temperaturaGrausFahrenheit,temperaturaGrausCelsius,conversao;

        System.out.println("Informe a temperatura em Fahrenheit");
        temperaturaGrausFahrenheit = entrada.nextDouble();


        conversao = 5 * ((temperaturaGrausFahrenheit-32) / 9);

        System.out.println(temperaturaGrausFahrenheit + "F " + " = " + conversao +"C");


    }
}
