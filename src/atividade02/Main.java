package atividade02;
import java.util.Scanner;

public class Main {
    private static Scanner leitor;
    public static void main(String[] args) {
        leitor = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.print("Nome da pessoa1: ");
        pessoa1.setNome(leitor.nextLine());

        System.out.print("Sobrenome da pessoa 1: ");
        pessoa1.setSobrenome(leitor.nextLine());

        System.out.print("Idade da pessoa 1: ");
        pessoa1.setIdade(leitor.nextLine());

        System.out.print("Nome da pessoa2: ");
        pessoa2.setNome(leitor.nextLine());

        System.out.print("Sobrenome da pessoa 2: ");
        pessoa2.setSobrenome(leitor.nextLine());

        System.out.print("Idade da pessoa 2: ");
        pessoa2.setIdade(leitor.nextLine());

      
        System.out.println("Lista de Pessoas cadastrados: ");

        System.out.println("Pessoa1");
        System.out.println("Nome:   "       + pessoa1.getNome());
        System.out.println("Sobrenome: "    + pessoa1.getSobrenome());
        System.out.println("Idade:  "       + pessoa1.getIdade());
        System.out.println("Pessoa2");
        System.out.println("Nome:   "       + pessoa2.getNome());
        System.out.println("Sobrenome:   "  + pessoa2.getSobrenome());
        System.out.println("Idade:  "       + pessoa2.getIdade());
        System.out.println("\n\n");
    }
    
}
