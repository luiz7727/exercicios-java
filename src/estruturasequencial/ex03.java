package estruturasequencial;

import java.util.Scanner;

public class ex03 {
    //Faça um Programa que peça dois números e imprima a soma.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b,contaFinal;

        System.out.println("Informe um numero");
        a = entrada.nextInt();
        System.out.println("Informe outro numero");
        b = entrada.nextInt();

        contaFinal = a+b;
        System.out.println("Total: " + contaFinal);

    }
}
