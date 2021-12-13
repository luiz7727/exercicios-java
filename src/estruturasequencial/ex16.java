package estruturasequencial;

import java.util.Scanner;
public class ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //dados
        //tamanho em metros da área a ser pintada.
        //quantidade de latas de tinta a serem compradas e o total

        int tamanhoArea=0;
        int litros=0,latas=0;

        System.out.println("Informe em metros, a quantidade da área que ira ser pintada");
        tamanhoArea = scan.nextInt();

        litros = tamanhoArea/3;
        latas =litros/18;

        if (litros % 18 != 0) { latas+=1; }

        System.out.println("Voce devera comprar " + latas + " latas");
        System.out.println("O valor total é R$" + latas*80);

    }
}
