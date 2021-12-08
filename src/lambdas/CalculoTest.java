package lambdas;

public class CalculoTest {

    public static void main(String[] args) {
        Calculo soma = new Soma();
        Calculo multiplicador = new Multiplicar();


        System.out.println(soma.executar(10,10));
        System.out.println(multiplicador.executar(10,10));
    }
}
