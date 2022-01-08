package codigosBasicos;

public class Foreach {
    public static void main(String[] args) {

        double[] notas  = {12.0,12.0,12.0};

        //for normal

        System.out.println("For normal");
        for (int i=0; i< notas.length ;i++)
        {
            System.out.println(notas[i]);
        }

        System.out.println(); //para quebrar linha
        //foreach
        System.out.println("Foreach");

//        for (type var : array)
//        {
//            statements using var;
//        }

        for (double nota: notas)
        {
            System.out.println();
        }


    }
}
