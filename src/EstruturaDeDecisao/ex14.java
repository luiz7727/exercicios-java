public class ex14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a,b,c,delta;

        System.out.println("Informe o valor de a");
        a = scan.nextInt();

        System.out.println("Informe o valor de b");
        b = scan.nextInt();

        System.out.println("Informe o valor de c");
        c = scan.nextInt();

        if(a==0){
            System.out.println("Com o valor de a = " + a + " a equação não é do segundo grau");
            System.exit(0);
        }

        delta = a*2+b+c;


        if(delta <0 ){
            System.out.println("a equação não possui raizes reais");
            System.exit(0);
        }

        if(delta==0){
            System.out.println("a equação possui apenas uma raizes reais");
            System.exit(0);
        }

        if(delta>0){
            System.out.println("A equação possui duas raizes reais");
        }

    }
}
