package atividade_v1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        cabecalho();

        Scanner sc = new Scanner(System.in);
        byte opcao;
        char continua = 'N';
        
        do{
            exibirMenu();
            opcao = Byte.parseByte(sc.nextLine()); 

            switch(opcao){
                case 1:
                    creditoPessoal();
                break;
                case 2:
                    creditoImobiliario();
                break;
                case 3:
                    creditoEmpresarial();;
                break;
                case 4:
                    emprestimoConsignado();;
                 break;
                default:
                    mensNumInvalido();
                break; 
                        
            }

            if(opcao > 0 && opcao <= 4 ){
                do{
                    System.out.print("Para voltar digite V e para sair digite S:");
                    continua = sc.nextLine().toUpperCase().charAt(0);    
                }while(continua!='V' && continua!='S');
            }
            if( continua == 'S') {
                mensagemSair();
            }

        }while(opcao < 1 || opcao >= 4 || continua=='V');

        sc.close();
        
    }
    static void cabecalho() {
        System.out.println("+-------------------------------------------+");
        System.out.println("+------------------Bem Vindo----------------+");
        System.out.println("+-----------Bradesco Financiamentos---------+");
        System.out.println("+-------------------------------------------+");
    }
    static void exibirMenu() {
        System.out.println("+-------------------------------------------+");
        System.out.println("|          Escolha uma opção:               |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Crédito Pessoal                       |");
        System.out.println("| 2 - Crédito Imobiliário                   |");
        System.out.println("| 3 - Crédito Empresarial                   |");
        System.out.println("| 4 - Empréstimo Consignado                 |");
        System.out.println("+-------------------------------------------+");
    } 
     static void mensagemSair() {
        System.out.println("+-------------------------------------------+");
        System.out.println("+------------------Obrigado-----------------+");
        System.out.println("+---------------Volte Sempre!---------------+");
        System.out.println("+-------------------------------------------+");
    }
    static void mensNumInvalido() {
        System.out.println("+-------------------------------------------+");
        System.out.println("+                 Alerta!!                  +");
        System.out.println("+--------O número digitado inválido.--------+");
        System.out.println("+              Tente novamente!!            +");
    }
    static void creditoPessoal() {
        System.out.println("+-------------------------------------------+");
        System.out.println("+--------------Crédito Pessoal.-------------+");
        System.out.println("+-------------------------------------------+");
    }
    static void creditoImobiliario() {
        System.out.println("+-------------------------------------------+");
        System.out.println("+------------Crédito Imobiliário.-----------+");
        System.out.println("+-------------------------------------------+");
    }
    static void creditoEmpresarial() {
        System.out.println("+-------------------------------------------+");
        System.out.println("+------------Crédito Empresarial.-----------+");
        System.out.println("+-------------------------------------------+");
    }
    static void emprestimoConsignado() {
        System.out.println("+-------------------------------------------+");
        System.out.println("+-----------Empréstimo Consignado-----------+");
        System.out.println("+-------------------------------------------+");
    }
}
