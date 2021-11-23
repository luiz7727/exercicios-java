package estruturasequencial;

import java.util.Scanner;

public class ex02 {
    //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero");
        numero = entrada.nextInt();

        System.out.println("Numero digitado " + numero);
    }
}
