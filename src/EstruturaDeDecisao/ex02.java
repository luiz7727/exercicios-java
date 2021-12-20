package EstruturaDeDecisao;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numero;

        System.out.println("Informe um numero");
        numero = scan.nextInt();

        if(numero < 0)
        {
            System.out.println("Esse numero e negativo");
        }
        else
        {
            System.out.println("Esse numero e positivo");
        }
    }
}
