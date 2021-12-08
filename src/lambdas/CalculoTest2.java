package lambdas;

public class CalculoTest2 {
    public static void main(String[] args) {
        //funções anonimas(sem nomes)

        //arrow function
        Calculo calc = (a,b) -> {
            //como essa função tem a,b como parametro e é obrigada a retornar um double.Eu preciso colocar o return
            //se eu colocar mais parametros do que foi declarado na método na interface, java dá um erro.
            return a + b;
        };

        System.out.println(calc.executar(12,3));

        calc = (valora,valorb)->{
            return valora*valorb;
        };

        System.out.println(calc.executar(5,5));


        //tbm tem
        // se eu não coloquei as {} o valor vai ser retornado direto na variável
        //não posso colocar nem o return
        calc = (x,y) -> x*y;
        System.out.println(calc.executar(9,9));

    }
}
