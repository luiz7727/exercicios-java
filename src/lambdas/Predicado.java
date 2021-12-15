package lambdas;

import org.w3c.dom.ls.LSOutput;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> prod.preco>=750;

        Produto produto = new Produto("arroz",12.90,20.0);

        System.out.println(isCaro.test(produto));
    }
}
