package EstruturaDeDecisao;

import java.util.Scanner;
//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sexo;

        System.out.println("Digite o seu sexo [F] ou [M]");
        sexo = scan.next();

        if(sexo.equalsIgnoreCase("m"))
        {
            System.out.println("M-Masculino");
        }else if(sexo.equalsIgnoreCase("f"))
        {
            System.out.println("F-Feminino");
        }else
        {
            System.out.println("Sexo invalido");
        }

    }
}
