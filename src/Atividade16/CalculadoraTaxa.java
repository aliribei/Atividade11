package Atividade16;

public class CalculadoraTaxa {
    double percentual = 0.0;
    double valorJuros = 0.0;
    double valorSaldo = 0.0;


    public double taxaTransferencia(double valor){
        percentual = 0.001;
        valorJuros = percentual * valor;
        valorSaldo = valor - valorJuros;
        return valorSaldo;
    } 

    public double taxaSaque(double valor){

        return valor;
    } 
}
