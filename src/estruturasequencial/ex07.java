package estruturasequencial;

import java.util.Scanner;
public class ex07 {
    //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
    //http://calcularaarea.com/
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int base,altura,area,doubleArea;

        System.out.println("Digite a base");
        base = entrada.nextInt();

        System.out.println("Digite a altura");
        altura = entrada.nextInt();


        area = base*altura;
        System.out.println("A área é " + area);

        doubleArea = area*2;
        System.out.println("O dobro da area eh" + doubleArea);


    }
}
