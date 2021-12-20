package EstruturaDeDecisao;

import java.util.Scanner;

//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String vetorVogais[] = {"a","e","i","o","u"};

        String letra=null;

        System.out.println("Digite uma letra");

        letra = scan.next();

        for(int i=0; i<vetorVogais.length; i++) {
            if(vetorVogais[i].equalsIgnoreCase(letra)){

                System.out.println("Esse letra e vogal");
                System.out.println(letra);
                break;
            }
            else
            {
                System.out.println("Essa letra nao eh vogal.");
                break;
            }
        }


    }
}
