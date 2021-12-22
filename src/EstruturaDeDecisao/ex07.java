package EstruturaDeDecisao;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("Digite um numero");
        n1 = scan.nextInt();

        System.out.println("Digite outro numero");
        n2 = scan.nextInt();

        System.out.println("Digite outro numero");
        n3 = scan.nextInt();

        //maior
        if(n1 > n2 && n1 > n3)
        {
            System.out.println("Numero " + n1 + " eh " + " maior");
        }else if(n2 > n1 && n2 > n3)
        {
            System.out.println("Numero " + n2 + " eh " + " maior");
        }else
        {
            System.out.println("Numero " + n3 + " eh " + " maior");
        }

        //menor
        if(n1 < n2 && n1 < n3)
        {
            System.out.println("Numero " + n1 + " eh " + " menor");
        }else if(n2 < n1 && n2 < n3)
        {
            System.out.println("Numero " + n2 + " eh " + " menor");
        }else
        {
            System.out.println("Numero " + n3 + " eh " + " menor");
        }


    }
}
