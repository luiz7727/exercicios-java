import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int ano;

        System.out.println("Digite um numero de um ano");
        ano = scan.nextInt();

        if(ano % 6 == 0){
            System.out.println("O ano de " + ano + " eh bissexto");
        }
        else
        {
            System.out.println("O ano de " + ano + " nao eh bissexto");
        }
    }
}
