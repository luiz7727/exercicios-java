package estruturasequencial;

import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tamanhoArquivo;
        int velocidadeLink;
        int tempoAproximado;

        System.out.println("Porfavor, insira o tamanho d arquivo em  MB");
        tamanhoArquivo = scan.nextInt();

        System.out.println("Informe a velocidade de um link de internet");
        velocidadeLink = scan.nextInt();


        tempoAproximado = (tamanhoArquivo/velocidadeLink)/60;

        System.out.println("A velocidade vai ser " + tempoAproximado);



    }
}
