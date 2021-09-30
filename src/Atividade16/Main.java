package Atividade16;

import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        short opcao = 4;
        double valor = 100.00;
        double valorSaque = 5.0;
        double saldo;

        sc = new Scanner(System.in);
        CalculadoraTaxa  calculadora1  = new CalculadoraTaxa();
        ContaBanco conta = new ContaBanco();

        System.out.println("Calculadora de taxas: ");

        System.out.println("Digite o valor de saque: ");

        do{
            exibirMenu();

            System.out.print("Opção escolhida: ");
            opcao = sc.nextShort();
       

            switch(opcao){
                case 1:
                    valorSaque = 50.0;
                    saldo = conta.saldo();
                    conta.sacar(calculadora1.taxaSaque(valorSaque));
                    if ( valorSaque > saldo)
                    {
                        System.out.printf("Saldo insuficiente: %.2f\n", saldo);
                        break;
                    }else {
                        System.out.printf(" O valor %.2f foi sacado da sua conta!\n O saldo da sua conta é : %.2f", valorSaque, saldo);
                    }
                    break;
                case 2:
                    conta.depositar(valor);
                    System.out.printf(" O valor %.2f foi depositado na sua conta!\n", valor);
                    break;
                case 3:
                    saldo = conta.saldo();
                    System.out.printf(" O saldo da conta é:  %f\n", saldo);
                    break;
                case 4:
                    exibirMenu();
                 break;
            }
        }while(opcao != 0);

        //double res1 =  (valor);
       // double res2 = calculadora1.taxaSaque(valor);
        //double res3 = calculadora1.taxaSaque(valor);
        //double res4 = calculadora1.taxaSaque(valor);
        //double res5 = calculadora1.taxaSaque(valor);
        //double res6 = calculadora1.taxaSaque(valor);
        //double res7 = calculadora1.taxaSaque(valor);



        //System.out.println(res1);
        //System.out.println(res2);
        //System.out.println(res3);
        //System.out.println(res4);
        //System.out.println(res5);
        //System.out.println(res6);
        //System.out.println(res7);
    
    } 

    static void exibirMenu() {
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("+------------------Bem Vindo----------------+");
        System.out.println("+-------------------------------------------+");
        System.out.println("|          Escolha uma opção:               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Realizar saque                        |");
        System.out.println("| 2 - Fazer um deposito                     |");
        System.out.println("| 3 - Exibir saldo                          |");
        System.out.println("| 4 - Exibir o menu de opções               |");
        System.out.println("| 0 - Sair                                  |");
        System.out.println("+-------------------------------------------+");
    }

}
