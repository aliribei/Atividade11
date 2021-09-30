package Atividade16;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculadora de taxas: ");
        CalculadoraTaxa  calculadora  = new CalculadoraTaxa();

        double valor = 100.00;

        double res1 =  calculadora.taxaTransferencia(valor);

        System.out.println(res1);
    
    } 
}
