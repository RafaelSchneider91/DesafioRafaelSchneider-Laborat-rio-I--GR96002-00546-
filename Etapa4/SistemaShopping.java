package Etapa4;

import java.util.Scanner;

public class SistemaShopping {

    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        Shopping shopping = null;

        while (!sair) {
            System.out.println("-------- Bem Vindo ao Sistema do Shopping --------");

            // Opções do menu apresentadas ao usuário
            System.out.println("1. Criar um novo shopping.");
            System.out.println("2. Inserir nova loja");
            System.out.println("3. Remover loja.");
            System.out.println("4. Exibir lojas.");



            System.out.println("9. Sair do sistema.");

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
                    shopping = new Shopping(nome, endereco1, numerodelojas);


                    System.out.println("Shopping criado: " + shopping.getNome());

                    

                    break;
                    case 2: //Criar a loja do tipo conforme selecao do usuario.

                    boolean voltarLoja = false;
                
                    while (!voltarLoja) {
                        // Opções do menu apresentadas ao usuário
                        System.out.println("-------Digite o tipo de loja a ser criada:");
                        System.out.println("1. Informatica");
                        System.out.println("2. Cosmetico");
                        System.out.println("3. Bijuteria");
                        System.out.println("4. Alimentação");
                        System.out.println("5. Vestuario");
                        System.out.println("9. Voltar");
                
                        // Lê a opção escolhida pelo usuário
                        int opcaoLoja = scanner.nextInt();
                
                        switch (opcaoLoja) {
                            case 1: //Informatica
                                System.out.println("Digite o nome da loja de Informática: ");
                                scanner.nextLine();
                                String nomeLojaInformatica = scanner.nextLine();

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
                                Data datafundacaoloja = new Data(31, 10, 2023);

                                System.out.println("Digite a quantidade funcionarios: ");
                                int numerofuncionarios = scanner.nextInt();

                                System.out.println("Digite a quantidade de produtos: ");
                                int numeroprodutos = scanner.nextInt();
                                
                                System.out.println("Digite o valor do seguro: ");
                                double valorseguro = scanner.nextInt();

                                System.out.println("Digite o valor do salario base: ");
                                double salarioBase = scanner.nextInt();


                                Informatica informatica = new Informatica(nomeLojaInformatica, numerofuncionarios, salarioBase, enderecoloja, datafundacaoloja, valorseguro, numeroprodutos);
                                System.out.println("Loja de Informática criada: " + nomeLojaInformatica);

                                System.out.println(informatica.toString());

                                break;
                
                            case 2: //Cosmetico
                                System.out.println("Digite o nome da loja de Cosméticos: ");
                                // scanner.nextLine();
                                // String nomeLoja = scanner.nextLine();
                                // Outros detalhes específicos da loja de Cosméticos
                                // ...
                                // Crie a loja de Cosméticos
                                // ...
                
                                // System.out.println("Loja de Cosméticos criada: " + nomeLoja);
                                break;
                
                            case 3: //Bijuteria
                                System.out.println("Digite o nome da loja de Bijuteria: ");
                                scanner.nextLine();
                                String nomelojabijuteria = scanner.nextLine();


                            
                                // Bijuteria lojaBijuteria = new Bijuteria(nomelojabijuteria, 10, 2100, e1, d1, 5000, 10);
                                // System.out.println("Loja Bijuteria "+ lojaBijuteria.getNome() + " criada com sucesso!");
                                break;
                
                            case 4:
                                System.out.println("Em dev!");
                                break;
                            case 5:
                                System.out.println("Em dev!");
                                break;
                
                            case 9:
                                voltarLoja = true;
                                break;
                
                            default:
                                System.out.println("Opção inválida!");
                                break;
                        }
                    }
                    break;
                              
                case 3:
                    System.out.println("Em desenvolvimento!");
                    break;
                case 4: //Exibir as lojas
                    if (shopping != null) {
                        shopping.imprimeLojas();
                    } else {
                        System.out.println("Nenhum loja foi criada ainda.");
                    }
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
