package Etapa3;

public class Main {

    public static void main(String[] args)
    {   
        Data data = new Data(12,10,2021);
        // Endereco end1 = new Endereco("Rua abc", "NMT", "RS", "BRASIL", "1454212","158", "CASA");
        // Cosmetico cosmetico = new Cosmetico("Test", 50, 500.00, end1, data);
        // System.out.println(cosmetico.toString());


        Endereco e1 = new Endereco("Rua dos Bobos", "Piraporinha", "SC", "Uruguai", "99000-100", "0", "Fundos");
		System.out.println("\n[OK] Classe Endereco identificada");

        //// Verificação da classe Data
		//instância
		Data d1 = new Data(10, 3, 2023);
		System.out.println("\n[OK] Classe Data identificada");

       //// Verificação da classe Cosmetico
		//Criação da instância
		Cosmetico lojaCosmetico = new Cosmetico("Loja Cosmético", 10, 2100, e1, d1, 20);
		System.out.println("\n[OK] Classe Cosmetico identificada");

        //// Verificação da classe Vestuario
		//Criação da instância
		Vestuario lojaVestuario = new Vestuario("Loja Vestuário", 10, 2100, e1, d1, false);
		System.out.println("\n[OK] Classe Vestuario identificada");
    }
}