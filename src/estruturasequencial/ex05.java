package estruturasequencial;

import java.util.Scanner;

public class ex05 {
    //Faça um Programa que converta metros para centímetros.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int metros,centimetros;

        System.out.println("Informe um numero em metros");
        metros = entrada.nextInt();

        System.out.println("convertendo para centimetros");

        centimetros = metros*100;

        System.out.println(metros +" metros "+ " = " + centimetros + " centimetros");
    }
}
