package estruturasequencial;

import java.util.Scanner;

public class ex04 {
    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n1,n2,n3,n4,mediaFinal;

        System.out.println("Informe a primeira nota");
        n1 = entrada.nextInt();
        System.out.println("Informe a segunda nota");
        n2 = entrada.nextInt();
        System.out.println("Informe a terceira nota");
        n3 = entrada.nextInt();
        System.out.println("Informe a quarta nota");
        n4 = entrada.nextInt();

        mediaFinal = (n1+n2+n3+n4)/4;

        System.out.println("Média Final: " + mediaFinal);
    }
}
