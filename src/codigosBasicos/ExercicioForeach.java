package codigosBasicos;

import java.util.Scanner;
public class ExercicioForeach {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeNotas;
        double notasArmazenadas=0,media=0;

        System.out.println("Digite a quantidade de notas que deseja cadastrar");
        quantidadeNotas = scan.nextInt();

        double[] vetorNotas = new double[quantidadeNotas];

        //usando for para cadastrar as notas
        for (int i=0;i< vetorNotas.length;i++){
            System.out.println("Digite a " + i + " nota");
            vetorNotas[i] = scan.nextDouble();
        }

        //usando foreach para somar todas as notas
        for (double notas: vetorNotas){
            notasArmazenadas += notas;
        }

        media = notasArmazenadas / quantidadeNotas;

        System.out.println("A media eh " + media);
    }
}
