package estruturasequencial;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        //Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
        //Para homens: (72.7*h) - 58
        //Para mulheres: (62.1*h) - 44.7
        Scanner scan = new Scanner(System.in);
        double altura;
        int sexo;
        double pesoIdeal;

        System.out.println("Digite a sua altura");
        altura = scan.nextDouble();

        System.out.println("Digite o seu sexo");
        System.out.println("1-[HOMEM]");
        System.out.println("2-[MULHER]");
        sexo = scan.nextInt();

        if(sexo == 1)
        {
            pesoIdeal = (72.7*altura) - 58;
            System.out.println("O seu peso ideal é " + pesoIdeal);
        }
        else
        {
            pesoIdeal = (62.1*altura) - 44.7;
            System.out.println("O seu peso ideal é " + pesoIdeal);
        }




    }
}
