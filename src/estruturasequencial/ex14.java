package estruturasequencial;
import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        //João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.

        Scanner scan = new Scanner(System.in);

        double peso;

        double excesso; //guardar a quantidade de quilos além do limite
        double multa; //valor da multa que João deve pagar

        System.out.println("Digite a quantidade de quilos do peixe");
        peso = scan.nextDouble();

        if(peso>50)
        {
            excesso = peso - 50;
            multa = excesso * 50;

            System.out.println("Quantidade de excesso: " + excesso);
            System.out.println("Multa: " + multa);
        }else
        {
            System.out.println("Tudo certo, pode ir.");
        }

    }
}
