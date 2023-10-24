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

       //// Verificação da classe Cosmetico
		//Criação da instância
		Cosmetico lojaCosmetico = new Cosmetico("Loja Cosmético", 10, 2100, e1, d1, 20, 10);
		System.out.println("\n[OK] Classe Cosmetico identificada");
    }
}
