package EstruturaDeDecisao;

import java.util.Scanner;

public class ex08 {
    //Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double preco1,preco2,preco3;

        System.out.println("Digie um preço");
        preco1 = scan.nextDouble();

        System.out.println("Digie outro preço");
        preco2 = scan.nextDouble();

        System.out.println("Digie outro preço");
        preco3 = scan.nextDouble();


        if(preco1 > preco2 && preco1 >preco3)
        {
            System.out.println("Vc deveria comprar esse " + preco1);
        }else if(preco2 > preco1 && preco2 >preco3)
        {
            System.out.println("Vc deveria comprar esse " + preco2);
        }else
        {
            System.out.println("Vc deveria comprar esse " + preco3);
        }
    }
}
