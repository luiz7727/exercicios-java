package estruturasequencial;

import java.util.Scanner;
public class ex10 {
    //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double temperaturaGrausFahrenheit,temperaturaGrausCelsius,conversao;

        System.out.println("Informe a temperatura em Celsius");
        temperaturaGrausCelsius = entrada.nextDouble();


        conversao = (temperaturaGrausCelsius*1.8)+32;

        System.out.println(temperaturaGrausCelsius + "C " + " = " + conversao +"F");
    }
}
