package Etapa4;

import java.util.Scanner;

public class SistemaShopping {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Gerenciador de Lojas");

         // Opções do menu apresentadas ao usuário
         System.out.println("1. Adicionar uma nova loja");
         System.out.println("2. Remover uma loja");

         // Lê a opção escolhida pelo usuário
        int opcao = scanner.nextInt();

        System.out.println("Opção escolhida: " + opcao);

    }
    
}
