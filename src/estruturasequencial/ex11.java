package estruturasequencial;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
        //o produto do dobro do primeiro com metade do segundo .
        //a soma do triplo do primeiro com o terceiro.
        //o terceiro elevado ao cubo.
        Scanner scan = new Scanner(System.in);
        int number1,number2;
        int contaFinalInt ;
        double numberReal;
        double contaFinal;

        System.out.println("Digite um numero: ");
        number1 = scan.nextInt();

        System.out.println("Digite outro numero: ");
        number2  = scan.nextInt();

        System.out.println("Digite outro numero");
        numberReal = scan.nextDouble();

        contaFinalInt = (number1*number1) + ((number2)/2);

        System.out.println("A-) " + contaFinalInt);

        contaFinal = (number1*number1*number1) + numberReal;

        System.out.println("B-) " + contaFinal);

        contaFinal = numberReal*numberReal*numberReal;

        System.out.println("C-) " + contaFinal);


    }
}
