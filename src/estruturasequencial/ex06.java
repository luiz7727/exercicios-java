package estruturasequencial;

import java.util.Scanner;

public class ex06 {
    //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
    //http://calcularaarea.com/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int raio;
        double area;


        System.out.println("Informe o raio do circulo");
        raio = entrada.nextInt();

        area = 3.14*(raio*raio);

        System.out.println("A área vai ser " + area);


    }
}
