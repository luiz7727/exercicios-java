package estruturasequencial;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        //Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

        Scanner scan = new Scanner(System.in);

        double altura;
        double pesoIdeal;


        System.out.println("Digite a sua altura");
        altura = scan.nextDouble();

        pesoIdeal = (72.7*altura) - 58;

        System.out.println("O seu peso ideal é " + pesoIdeal);
    }
}
