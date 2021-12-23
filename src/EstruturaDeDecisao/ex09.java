package EstruturaDeDecisao;

import java.util.Scanner;

public class ex09 {
    //Faça um Programa que leia três números e mostre-os em ordem decrescente.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetorNumeros = new int[3];

        int n1,n2,n3;


        System.out.println("Digite um numero");
        n1 = scan.nextInt();

        System.out.println("Digite outro numero");
        n2 = scan.nextInt();

        System.out.println("Digite outro numero");
        n3 = scan.nextInt();


        if(n1 > n2 && n2 > n3)
        {
            System.out.println("Ordem decrescente: " + n1 + " " + n2+ " " + n3);
        }
        else if(n2 > n1 && n1 > n3)
        {
            System.out.println("Ordem decrescente: " + n2 +" "+ n1 +" " + n3);
        }
        else
        {
            System.out.println("Ordem decrescente: " + n3 +" "+ n2 +" "+ n1);
        }

    }
}
