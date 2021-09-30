package Atividade16;

public class CalculadoraTaxa {
    private double percentual = 0.001;
    private double valorJuros = 0.0;
    private double valorSaldo = 0.0;
    private double taxaSaque = 1.30;
    int qtdSaques;


    public double taxaTransferencia(double valor){
        valorJuros = percentual * valor;
        valorSaldo = valor - valorJuros;
        return valorSaldo;
    } 

    public double taxaSaque( double valor){

        qtdSaques ++;
        if (qtdSaques%5 == 0 ) {
            return valor - taxaSaque;
        }
        return  valor;
    } 
}
