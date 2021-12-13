package estruturasequencial;
import java.util.Scanner;
public class ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //dados de entrada
        //quando recebe por hora
        //numero de horas trabalhadas

        //calcular e informar o total do salário referico no mes.
        //Descontos
        //11%-Imposto De Renda(ok)
        //8%-INSS
        //5%-SINDICATO

        //saidas
        //Salário Bruto
        //Quanto pagou para o INSS
        //Quanto pagou para o sindicato
        //Salário Líquido

        double valorHora=0,salarioBruto=0,descontoImpostoDeRenda=0,descontoInss=0,descontoSindicato=0;
        int horasTrabalhadas=0;
        double valorPagoInss=0,valorPagoImpostoRenda=0,valorPagoSindicato=0,salarioLiquido=0;

        System.out.println("Informe quanto vc recebe por hora");
        valorHora = scan.nextDouble();

        System.out.println("Informe o número de horas trabalhadas");
        horasTrabalhadas = scan.nextInt();

        salarioBruto = valorHora*horasTrabalhadas;

        System.out.println("Salário Bruto R$" + salarioBruto);

        descontoImpostoDeRenda = salarioBruto - (salarioBruto * 11/100);
        descontoInss = salarioBruto - (salarioBruto*8/100);
        descontoSindicato = salarioBruto - (salarioBruto*5/100);


        valorPagoImpostoRenda = salarioBruto - descontoImpostoDeRenda ;
        valorPagoInss = salarioBruto - descontoInss;
        valorPagoSindicato = salarioBruto-descontoSindicato;

        salarioLiquido =  salarioBruto - valorPagoImpostoRenda - valorPagoInss - valorPagoSindicato;

        System.out.println("=====Tabela=====");
        System.out.println("Salário Bruto R$" + salarioBruto);
        System.out.println("IR (11%) : R$" + valorPagoImpostoRenda);
        System.out.println("INSS (8%) : R$" + valorPagoInss);
        System.out.println("Sindicato (5%) : R$" + valorPagoSindicato);
        System.out.println("Salário Liquido : R$" + salarioLiquido);

    }
}
