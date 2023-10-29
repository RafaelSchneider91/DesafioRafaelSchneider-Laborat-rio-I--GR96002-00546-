package Etapa4;

import java.util.Scanner;

public class SistemaShopping {

    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        while (!sair) {
            System.out.println("-------- Bem Vindo ao Sistema do Shopping --------");

            // Opções do menu apresentadas ao usuário
            System.out.println("1. Criar um novo shopping.");
            System.out.println("2. Inserir nova loja");
            System.out.println("3. Remover loja.");
            System.out.println("4. Sair do sistema.");

            // Lê a opção escolhida pelo usuário
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do Shopping: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.println("Digite o nome da Rua: ");
                    String rua = scanner.nextLine();
                    System.out.println("Digite o nome da Cidade: ");
                    String cidade = scanner.nextLine();
                    System.out.println("Digite o nome da UF: ");
                    String UF = scanner.nextLine();
                    System.out.println("Digite o nome da País: ");
                    String pais = scanner.nextLine();
                    System.out.println("Digite o nome da CEP: ");
                    String CEP = scanner.nextLine();
                    System.out.println("Digite o nome da numero: ");
                    String numero = scanner.nextLine();
                    System.out.println("Digite o nome da complemento: ");
                    String complemento = scanner.nextLine();
                    

                    Endereco endereco1 = new Endereco(rua, cidade, UF, pais, CEP, numero, complemento);

                    System.out.println("Digite o numero de lojas: ");
                    int numerodelojas = scanner.nextInt();
                    Shopping shopping1 = new Shopping(nome, endereco1, numerodelojas);

                    System.out.println("Shopping criado: " + shopping1.getNome());

                    break;
                case 2:
                    // Inserir nova loja;            
                    System.out.println("Digite o nome da loja: ");
                    scanner.nextLine();
                    String nomeloja = scanner.nextLine();                    

                    System.out.println("Digite o numero de funcionarios: ");
                    int numerodefunc = scanner.nextInt();
                    
                    System.out.println("Digite o nome da Rua: ");
                    String rualoja = scanner.nextLine();
                    System.out.println("Digite o nome da Cidade: ");
                    String cidadeloja = scanner.nextLine();
                    System.out.println("Digite o nome da UF: ");
                    String UFloja = scanner.nextLine();
                    System.out.println("Digite o nome da País: ");
                    String paisloja = scanner.nextLine();
                    System.out.println("Digite o nome da CEP: ");
                    String CEPloja = scanner.nextLine();
                    System.out.println("Digite o nome da numero: ");
                    String numeroloja = scanner.nextLine();
                    System.out.println("Digite o nome da complemento: ");
                    String complementoloja = scanner.nextLine();

                    Endereco enderecoloja = new Endereco(rualoja, cidadeloja, UFloja, paisloja, CEPloja, numeroloja, complementoloja);

                    System.out.println("Digite o dia de fundacao: ");
                    int diafund = scanner.nextInt();
                    System.out.println("Digite o mês de fundacao: ");
                    int mesfund = scanner.nextInt();
                    System.out.println("Digite o ano de fundacao: ");
                    int anofund = scanner.nextInt();


                    Data datafundacao = new Data(diafund, mesfund, anofund);

                    System.out.println("Digite a quantidade de produtos: ");
                    int qntprodutos = scanner.nextInt();


                    Loja loja = new Loja(nomeloja, numerodefunc, enderecoloja, datafundacao, qntprodutos);

                    System.out.println("Loja : " + loja.getNome() + " criada.");
                    break;                
                case 3:
                    System.out.println("Em desenvolvimento!");
                    break;
                case 9:
                    sair = true;
                    System.out.println("Saindo do sistema.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
