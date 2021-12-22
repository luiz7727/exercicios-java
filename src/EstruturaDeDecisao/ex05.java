package EstruturaDeDecisao;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota1=0,nota2=0;

        double media=0;

        System.out.println("Digite a primeira nota");
        nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota");
        nota2 = scan.nextDouble();

        media = (nota1+nota2)/2;

        if(media == 10)
        {
            System.out.println("Media: " + media);
            System.out.println("Aprovado com Distinçao");
        }else if(media >= 7)
        {
            System.out.println("Media: " + media);
            System.out.println("Aprovado");
        }else
        {
            System.out.println("Media: " + media);
            System.out.println("Reprovado");
        }
    }
}
