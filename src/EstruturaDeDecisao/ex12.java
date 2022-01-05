package EstruturaDeDecisao;

import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1,nota2,media;

        System.out.println("Digite a sua primeira nota");
        nota1 = scan.nextDouble();

        System.out.println("Digite a sua segunda nota");
        nota2 = scan.nextDouble();

        media = (nota1+nota2)/2;


        System.out.println("MEDIA DE APROVEITAMENTO");
        System.out.println("Entre 9.0 e 10.0");
        System.out.println("Entre 7.5 e 9.0");
        System.out.println("Entre 6.0 e 7.5");
        System.out.println("Entre 4.0 e 6.0");
        System.out.println("Entre 4.0 e zero");

        System.out.println("Conceito");
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");
        System.out.println("D");
        System.out.println("E");

        if(media >= 9.0 && media <=10.0){
            System.out.println("NOTA A");
        }else if(media >= 7.5 && media <=9.0){
            System.out.println("NOTA B");
        }else if(media >= 6.0 && media <=7.5){
            System.out.println("NOTA C");
        }else if(media >= 4.0 && media <=6.0){
            System.out.println("NOTA D");
        }else if(media >= 0 && media <=4.0){
            System.out.println("NOTA E");
        }
    }
}
