package lambdas;

@FunctionalInterface//Ela faz com que tenha um unico metodo, porque la na main, o java fica perdido em saber qual função executar caso tenha
//mais de um método
public interface Calculo {

    public abstract double executar(double a, double b);
    //caso eu coloque outro método, eu não vou conseguir aplicar uma lambda expresion para uma variável.E vai dar erro...

}
