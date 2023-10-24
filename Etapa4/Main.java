package Etapa4;

public class Main {

    public static void main(String[] args)
    {  

        //// Verificação da classe Data
		//instância
		Data d1 = new Data(10, 3, 2023);
		System.out.println("\n[OK] Classe Data identificada");

        //// Verificação da classe Endereco
		//instância
		Endereco e1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
		System.out.println("\n[OK] Classe Endereco identificada");

        // Loja teste = new Loja("teste", 20, e1, d1);

        // //// Verificação da classe Loja
		Loja loja1 = new Loja ("E3", 5, e1, d1, 5);
		System.out.println("\n[OK] Classe Loja identificada (construtor com cinco parâmetros)");

        Loja loja2 = new Loja ("E7", 20, 2000, e1, d1, 2);
		System.out.println("[OK] Classe Loja identificada (construtor com seis parâmetros)");

        System.out.println(loja2.toString());


    }
}
