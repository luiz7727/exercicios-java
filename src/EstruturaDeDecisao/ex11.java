package EstruturaDeDecisao;

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dias_semana = {"", "", "", "", "", "", ""};

        int number = 0;


        System.out.println("Digite um numero");
        number = scan.nextInt();

        while (number > 7) {
            System.out.println("Numero invalido, digite um numero menor do que 7");
            number = scan.nextInt();
        }


        if (number == 1){
            System.out.println(number + "-Domingo");
        } else if (number == 2) {
            System.out.println(number + "-Segunda");
        }else if (number == 3) {
            System.out.println(number + "-Terca");
        }else if (number == 4) {
            System.out.println(number + "-Quarta");
        }else if (number == 5) {
            System.out.println(number + "-Quinta");
        }else if (number == 6) {
            System.out.println(number + "-Sexta");
        } else if (number == 2) {
            System.out.println(number + "-Sabado");
        }

    }
}
