package lambdas;

import java.util.function.BinaryOperator;

public class Calculoteste3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calcular = (a,b) ->{return a+b;};

        System.out.println(calcular.apply(2.0,4.0));
        //Usando o BinaryOPerator, eu não preciso definir uma classe interface.
        // se eu colocar um numero inteiro dá erro, pois ele espera um valor double e não integer
        //Tbm porque o java não conseguge converter o tipo double para int.


    }
}
