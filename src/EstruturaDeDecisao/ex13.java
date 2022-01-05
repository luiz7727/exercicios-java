package EstruturaDeDecisao;

import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lado1,lado2,lado3;

        System.out.println("Digite um numero para um lado");
        lado1 = scan.nextInt();
        System.out.println("Digite um numero para outro lado");
        lado2 = scan.nextInt();
        System.out.println("Digite um numero para outro lado");
        lado3 = scan.nextInt();

        if(lado1+lado2> lado3){
            System.out.println("Eh um triangulo");
        }else if(lado2+lado3> lado1){
            System.out.println("Eh um triangulo");
        }else if(lado3+lado1> lado2){
            System.out.println("Eh um triangulo");
        }

        if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1){
            System.out.println("Eh um triangulo Equilatero");
        }else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1){
            System.out.println("Eh um triangulo Isosceles");
        }else if(lado1 != lado2 && lado2 != lado3 || lado3 != lado1){
            System.out.println("Eh um triangulo Escaleno");
        }

    }
}
